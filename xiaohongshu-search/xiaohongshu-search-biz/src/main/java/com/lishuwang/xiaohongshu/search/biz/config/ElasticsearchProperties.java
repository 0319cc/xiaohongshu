package com.lishuwang.xiaohongshu.search.biz.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: shuwang Li
 * @date: 2024/12/3 15:56
 * @version: v1.0.0
 * @description: Elasticsearch 配置项
 **/
@ConfigurationProperties(prefix = "elasticsearch")
@Component
@Data
public class ElasticsearchProperties {
    private String address;
}
