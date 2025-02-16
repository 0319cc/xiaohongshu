package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 20:11
 * @Description: 笔记操作
 **/
@Getter
@AllArgsConstructor
public enum NoteOperateEnum {
    // 笔记发布
    PUBLISH(1),
    // 笔记删除
    DELETE(0),
    ;

    private final Integer code;

}

