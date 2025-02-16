package com.lishuwang.xiaohongshu.data.align.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 14:15
 * @Description: 点赞、取消点赞笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikeUnlikeNoteMqDTO {

    private Long userId;

    private Long noteId;

    /**
     * 0: 取消点赞， 1：点赞
     */
    private Integer type;

    /**
     * 笔记发布者 ID
     */
    private Long noteCreatorId;

    private LocalDateTime createTime;
}
