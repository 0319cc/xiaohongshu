package com.lishuwang.xiaohongshu.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 19:52
 * @Description: 笔记状态
 **/
@Getter
@AllArgsConstructor
public enum NoteStatusEnum {

    BE_EXAMINE(0), // 待审核
    NORMAL(1), // 正常展示
    DELETED(2), // 被删除
    DOWNED(3), // 被下架
    ;

    private final Integer code;

}
