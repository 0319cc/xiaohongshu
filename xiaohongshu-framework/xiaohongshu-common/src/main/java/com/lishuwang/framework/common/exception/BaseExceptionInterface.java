package com.lishuwang.framework.common.exception;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/7 23:15
 * @Description: TODO
 **/
public interface BaseExceptionInterface {
    // 获取异常码
    String getErrorCode();

    // 获取异常信息
    String getErrorMessage();
}
