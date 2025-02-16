package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 15:03
 * @Description: TODO
 **/
@Getter
@AllArgsConstructor
public enum NoteLikeLuaResultEnum {
    // 布隆过滤器或者 ZSet 不存在
    NOT_EXIST(-1L),
    // 笔记点赞成功
    NOTE_LIKE_SUCCESS(0L),
    // 笔记已点赞
    NOTE_LIKED(1L),
    ;

    private final Long code;

    /**
     * 根据类型 code 获取对应的枚举
     *
     * @param code
     * @return
     */
    public static NoteLikeLuaResultEnum valueOf(Long code) {
        for (NoteLikeLuaResultEnum noteLikeLuaResultEnum : NoteLikeLuaResultEnum.values()) {
            if (Objects.equals(code, noteLikeLuaResultEnum.getCode())) {
                return noteLikeLuaResultEnum;
            }
        }
        return null;
    }
}
