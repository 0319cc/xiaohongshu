package com.lishuwang.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/9 23:26
 * @Description: 状态
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}
