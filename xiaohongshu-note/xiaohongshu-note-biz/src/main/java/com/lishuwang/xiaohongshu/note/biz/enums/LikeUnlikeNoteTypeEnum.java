package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 15:58
 * @Description: 笔记点赞、取消点赞 Type
 **/
@Getter
@AllArgsConstructor
public enum LikeUnlikeNoteTypeEnum {
    // 点赞
    LIKE(1),
    // 取消点赞
    UNLIKE(0),
    ;

    private final Integer code;

}