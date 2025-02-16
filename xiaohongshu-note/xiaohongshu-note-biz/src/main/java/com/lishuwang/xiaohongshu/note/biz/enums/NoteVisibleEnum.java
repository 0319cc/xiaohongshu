package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 19:53
 * @Description: 笔记可见性
 **/
@Getter
@AllArgsConstructor
public enum NoteVisibleEnum {

    PUBLIC(0), // 公开，所有人可见
    PRIVATE(1); // 仅自己可见

    private final Integer code;

}
