package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 18:30
 * @Description: 笔记收藏、取消收藏 Type
 **/
@Getter
@AllArgsConstructor
public enum CollectUnCollectNoteTypeEnum {
    // 收藏
    COLLECT(1),
    // 取消收藏
    UN_COLLECT(0),
    ;

    private final Integer code;

}
