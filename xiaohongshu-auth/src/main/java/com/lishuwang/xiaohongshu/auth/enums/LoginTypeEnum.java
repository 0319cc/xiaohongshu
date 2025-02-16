package com.lishuwang.xiaohongshu.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/9 23:19
 * @Description: 登录类型
 **/
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {
    // 验证码
    VERIFICATION_CODE(1),
    // 密码
    PASSWORD(2);

    private final Integer value;

    public static LoginTypeEnum valueOf(Integer code) {
        for (LoginTypeEnum loginTypeEnum : LoginTypeEnum.values()) {
            if (Objects.equals(code, loginTypeEnum.getValue())) {
                return loginTypeEnum;
            }
        }
        return null;
    }

}