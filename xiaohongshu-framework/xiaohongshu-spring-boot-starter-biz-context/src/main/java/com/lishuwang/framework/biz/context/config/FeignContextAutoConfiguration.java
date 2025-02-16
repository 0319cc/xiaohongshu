package com.lishuwang.framework.biz.context.config;

import com.lishuwang.framework.biz.context.interceptor.FeignRequestInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 19:59
 * @Description: Feign 请求拦截器自动配置
 **/
@AutoConfiguration
public class FeignContextAutoConfiguration {

    @Bean
    public FeignRequestInterceptor feignRequestInterceptor() {
        return new FeignRequestInterceptor();
    }
}
