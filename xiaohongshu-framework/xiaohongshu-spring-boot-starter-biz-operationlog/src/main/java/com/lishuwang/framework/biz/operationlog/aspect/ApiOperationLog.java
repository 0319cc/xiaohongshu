package com.lishuwang.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/7 23:46
 * @Description: TODO
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}