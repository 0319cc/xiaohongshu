package com.lishuwang.xiaohongshu.data.align.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 14:59
 * @Description: 笔记操作
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteOperateMqDTO {

    /**
     * 笔记发布者 ID
     */
    private Long creatorId;

    /**
     * 笔记 ID
     */
    private Long noteId;

    /**
     * 操作类型： 0 - 笔记删除； 1：笔记发布；
     */
    private Integer type;

}
