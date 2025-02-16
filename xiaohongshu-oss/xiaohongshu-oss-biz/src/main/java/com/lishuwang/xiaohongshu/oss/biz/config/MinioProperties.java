package com.lishuwang.xiaohongshu.oss.biz.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:52
 * @Description: minio相关配置类
 **/
@ConfigurationProperties(prefix = "storage.minio")
@Component
@Data
public class MinioProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
