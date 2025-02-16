package com.lishuwang.xiaohongshu.note.biz.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 12:05
 * @Description: RocketMQ 配置类
 **/
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}
