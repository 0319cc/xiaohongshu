package com.lishuwang.xiaohongshu.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 17:10
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("com.lishuwang.xiaohongshu.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.lishuwang.xiaohongshu")
public class XiaohongshuNoteBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuNoteBizApplication.class, args);
    }
}
