package com.lishuwang.xiaohongshu.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 1:09
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("com.lishuwang.xiaohongshu.user.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.lishuwang.xiaohongshu")
public class XiaohongshuUserBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuUserBizApplication.class, args);
    }
}
