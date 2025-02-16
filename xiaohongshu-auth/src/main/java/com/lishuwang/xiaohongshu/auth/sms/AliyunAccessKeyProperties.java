package com.lishuwang.xiaohongshu.auth.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:27
 * @Description: TODO
 **/
@ConfigurationProperties(prefix = "aliyun")
@Component
@Data
public class AliyunAccessKeyProperties {
    private String accessKeyId;
    private String accessKeySecret;
}
