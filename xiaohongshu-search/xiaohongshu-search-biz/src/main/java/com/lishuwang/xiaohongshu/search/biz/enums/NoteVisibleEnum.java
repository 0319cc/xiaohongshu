package com.lishuwang.xiaohongshu.search.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: shuwang Li
 * @date: 2023-08-15 10:33
 * @description: 笔记可见性
 **/
@Getter
@AllArgsConstructor
public enum NoteVisibleEnum {

    PUBLIC(0), // 公开，所有人可见
    PRIVATE(1); // 仅自己可见

    private final Integer code;

}
