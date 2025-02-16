package com.lishuwang.xiaohongshu.user.relation.biz.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 17:00
 * @Description: 关注、取关消费者令牌桶配置类
 **/
@Configuration
@RefreshScope
public class FollowUnfollowMqConsumerRateLimitConfig {

    @Value("${mq-consumer.follow-unfollow.rate-limit}")
    private double rateLimit;

    @Bean
    @RefreshScope
    public RateLimiter rateLimiter() {
        return RateLimiter.create(rateLimit);
    }
}
