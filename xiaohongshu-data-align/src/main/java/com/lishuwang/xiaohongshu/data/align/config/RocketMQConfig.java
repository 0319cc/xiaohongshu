package com.lishuwang.xiaohongshu.data.align.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 14:04
 * @Description: RocketMQ 配置
 **/
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}
