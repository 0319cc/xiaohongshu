package com.lishuwang.framework.biz.operationlog.config;

import com.lishuwang.framework.biz.operationlog.aspect.ApiOperationLogAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/7 23:49
 * @Description: starter 自动配置类
 **/
@AutoConfiguration
public class ApiOperationLogAutoConfiguration {

    @Bean
    public ApiOperationLogAspect apiOperationLogAspect() {
        return new ApiOperationLogAspect();
    }
}