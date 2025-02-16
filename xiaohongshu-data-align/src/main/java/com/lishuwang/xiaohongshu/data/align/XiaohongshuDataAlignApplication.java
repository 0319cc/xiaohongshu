package com.lishuwang.xiaohongshu.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/12 21:32
 * @Description: TODO
 **/
@SpringBootApplication
@MapperScan("com.lishuwang.xiaohongshu.data.align.domain.mapper")
public class XiaohongshuDataAlignApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuDataAlignApplication.class, args);
    }
}
