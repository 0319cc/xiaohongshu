package com.lishuwang.framework.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/7 23:15
 * @Description: 业务异常
 **/
@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}

