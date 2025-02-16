package com.lishuwang.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/9 23:25
 * @Description: 逻辑删除
 **/
@Getter
@AllArgsConstructor
public enum DeletedEnum {

    YES(true),
    NO(false);

    private final Boolean value;
}