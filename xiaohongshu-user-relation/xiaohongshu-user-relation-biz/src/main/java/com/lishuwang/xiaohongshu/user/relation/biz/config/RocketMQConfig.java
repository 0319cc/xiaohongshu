package com.lishuwang.xiaohongshu.user.relation.biz.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 15:22
 * @Description: RocketMQ 配置
 **/
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}
