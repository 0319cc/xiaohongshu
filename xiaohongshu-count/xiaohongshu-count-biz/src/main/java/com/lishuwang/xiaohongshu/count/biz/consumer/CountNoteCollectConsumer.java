package com.lishuwang.xiaohongshu.count.biz.consumer;

import com.github.phantomthief.collection.BufferTrigger;
import com.lishuwang.framework.common.util.JsonUtils;
import com.lishuwang.xiaohongshu.count.biz.constant.MQConstants;
import com.lishuwang.xiaohongshu.count.biz.constant.RedisKeyConstants;
import com.lishuwang.xiaohongshu.count.biz.enums.CollectUnCollectNoteTypeEnum;
import com.lishuwang.xiaohongshu.count.biz.model.dto.CountCollectUnCollectNoteMqDTO;
import com.google.common.collect.Maps;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 19:52
 * @Description: 计数: 笔记收藏数
 **/
@Component
@RocketMQMessageListener(consumerGroup = "xiaohongshu_group_" + MQConstants.TOPIC_COUNT_NOTE_COLLECT, // Group 组
        topic = MQConstants.TOPIC_COUNT_NOTE_COLLECT // 主题 Topic
)
@Slf4j
public class CountNoteCollectConsumer implements RocketMQListener<String> {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    private BufferTrigger<String> bufferTrigger = BufferTrigger.<String>batchBlocking()
            .bufferSize(50000) // 缓存队列的最大容量
            .batchSize(1000)   // 一批次最多聚合 1000 条
            .linger(Duration.ofSeconds(1)) // 多久聚合一次
            .setConsumerEx(this::consumeMessage) // 设置消费者方法
            .build();

    @Override
    public void onMessage(String body) {
        // 往 bufferTrigger 中添加元素
        bufferTrigger.enqueue(body);
    }


    private void consumeMessage(List<String> bodys) {
        log.info("==> 【笔记收藏数】聚合消息, size: {}", bodys.size());
        log.info("==> 【笔记收藏数】聚合消息, {}", JsonUtils.toJsonString(bodys));

        // List<String> 转 List<CountCollectUnCollectNoteMqDTO>
        List<CountCollectUnCollectNoteMqDTO> countCollectUnCollectNoteMqDTOS = bodys.stream()
                .map(body -> JsonUtils.parseObject(body, CountCollectUnCollectNoteMqDTO.class)).toList();

        // 按笔记 ID 进行分组
        Map<Long, List<CountCollectUnCollectNoteMqDTO>> groupMap = countCollectUnCollectNoteMqDTOS.stream()
                .collect(Collectors.groupingBy(CountCollectUnCollectNoteMqDTO::getNoteId));

        // 按组汇总数据，统计出最终的计数
        // key 为笔记 ID, value 为最终操作的计数
        Map<Long, Integer> countMap = Maps.newHashMap();

        for (Map.Entry<Long, List<CountCollectUnCollectNoteMqDTO>> entry : groupMap.entrySet()) {
            List<CountCollectUnCollectNoteMqDTO> list = entry.getValue();
            // 最终的计数值，默认为 0
            int finalCount = 0;
            for (CountCollectUnCollectNoteMqDTO countCollectUnCollectNoteMqDTO : list) {
                // 获取操作类型
                Integer type = countCollectUnCollectNoteMqDTO.getType();

                // 根据操作类型，获取对应枚举
                CollectUnCollectNoteTypeEnum collectUnCollectNoteTypeEnum = CollectUnCollectNoteTypeEnum.valueOf(type);

                // 若枚举为空，跳到下一次循环
                if (Objects.isNull(collectUnCollectNoteTypeEnum)) continue;

                switch (collectUnCollectNoteTypeEnum) {
                    case COLLECT -> finalCount += 1; // 如果为收藏操作，点赞数 +1
                    case UN_COLLECT -> finalCount -= 1; // 如果为取消收藏操作，点赞数 -1
                }
            }
            // 将分组后统计出的最终计数，存入 countMap 中
            countMap.put(entry.getKey(), finalCount);
        }

        log.info("## 【笔记收藏数】聚合后的计数数据: {}", JsonUtils.toJsonString(countMap));

        // 更新 Redis
        countMap.forEach((k, v) -> {
            // Redis Hash Key
            String redisKey = RedisKeyConstants.buildCountNoteKey(k);
            // 判断 Redis 中 Hash 是否存在
            boolean isExisted = redisTemplate.hasKey(redisKey);

            // 若存在才会更新
            // (因为缓存设有过期时间，考虑到过期后，缓存会被删除，这里需要判断一下，存在才会去更新，而初始化工作放在查询计数来做)
            if (isExisted) {
                // 对目标用户 Hash 中的收藏总数字段进行计数操作
                redisTemplate.opsForHash().increment(redisKey, RedisKeyConstants.FIELD_COLLECT_TOTAL, v);
            }
        });

        // 发送 MQ, 笔记收藏数据落库
        Message<String> message = MessageBuilder.withPayload(JsonUtils.toJsonString(countMap))
                .build();

        // 异步发送 MQ 消息
        rocketMQTemplate.asyncSend(MQConstants.TOPIC_COUNT_NOTE_COLLECT_2_DB, message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                log.info("==> 【计数服务：笔记收藏数入库】MQ 发送成功，SendResult: {}", sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                log.error("==> 【计数服务：笔记收藏数入库】MQ 发送异常: ", throwable);
            }
        });
    }
}
