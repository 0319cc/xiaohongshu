package com.lishuwang.xiaohongshu.user.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 1:22
 * @Description: 性别
 **/
@Getter
@AllArgsConstructor
public enum SexEnum {

    WOMAN(0),
    MAN(1);

    private final Integer value;

    public static boolean isValid(Integer value) {
        for (SexEnum loginTypeEnum : SexEnum.values()) {
            if (Objects.equals(value, loginTypeEnum.getValue())) {
                return true;
            }
        }
        return false;
    }

}
