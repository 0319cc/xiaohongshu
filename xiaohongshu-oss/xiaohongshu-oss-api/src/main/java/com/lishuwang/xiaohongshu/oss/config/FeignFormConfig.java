package com.lishuwang.xiaohongshu.oss.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 1:54
 * @Description: 表单配置类
 **/
@Configuration
public class FeignFormConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}
