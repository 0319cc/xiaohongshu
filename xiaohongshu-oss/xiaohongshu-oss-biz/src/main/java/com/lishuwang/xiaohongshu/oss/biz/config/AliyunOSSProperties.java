package com.lishuwang.xiaohongshu.oss.biz.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:59
 * @Description: 阿里云 OSS 配置项
 **/
@ConfigurationProperties(prefix = "storage.aliyun-oss")
@Component
@Data
public class AliyunOSSProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
