package com.lishuwang.xiaohongshu.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 14:22
 * @Description: TODO
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = "com.lishuwang.xiaohongshu")
@MapperScan("com.lishuwang.xiaohongshu.user.relation.biz.domain.mapper")
public class XiaohongshuUserRelationBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuUserRelationBizApplication.class, args);
    }

}
