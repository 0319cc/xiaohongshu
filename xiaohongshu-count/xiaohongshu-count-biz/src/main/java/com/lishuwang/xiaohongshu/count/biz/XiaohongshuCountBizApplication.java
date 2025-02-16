package com.lishuwang.xiaohongshu.count.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 11:48
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("com.lishuwang.xiaohongshu.count.biz.domain.mapper")
public class XiaohongshuCountBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuCountBizApplication.class, args);
    }
}
