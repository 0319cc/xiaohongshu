package com.lishuwang.xiaohongshu.count.biz.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 20:06
 * @Description: 聚合后计数：点赞、取消点赞笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AggregationCountLikeUnlikeNoteMqDTO {

    /**
     * 笔记发布者 ID
     */
    private Long creatorId;

    /**
     * 笔记 ID
     */
    private Long noteId;

    /**
     * 聚合后的计数
     */
    private Integer count;

}