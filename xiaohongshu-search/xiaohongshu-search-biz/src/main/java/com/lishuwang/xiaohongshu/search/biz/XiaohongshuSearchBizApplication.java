package com.lishuwang.xiaohongshu.search.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.lishuwang.xiaohongshu.search.biz.domain.mapper")
public class XiaohongshuSearchBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuSearchBizApplication.class, args);
    }

}
