package com.lishuwang.xiaohongshu.oss.biz.factory;

import com.lishuwang.xiaohongshu.oss.biz.strategy.FileStrategy;
import com.lishuwang.xiaohongshu.oss.biz.strategy.impl.AliyunOSSFileStrategy;
import com.lishuwang.xiaohongshu.oss.biz.strategy.impl.MinioFileStrategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:44
 * @Description: 文件上传策略工厂类
 **/
@Configuration
@RefreshScope
public class FileStrategyFactory {

    @Value("${storage.type}")
    private String strategyType;

    @Bean
    @RefreshScope
    public FileStrategy getFileStrategy() {
        if (StringUtils.equals(strategyType, "minio")) {
            return new MinioFileStrategy();
        } else if (StringUtils.equals(strategyType, "aliyun")) {
            return new AliyunOSSFileStrategy();
        }

        throw new IllegalArgumentException("不可用的存储类型");
    }

}
