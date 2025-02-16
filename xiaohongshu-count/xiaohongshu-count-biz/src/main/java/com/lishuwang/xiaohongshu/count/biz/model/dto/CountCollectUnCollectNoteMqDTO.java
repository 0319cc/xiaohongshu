package com.lishuwang.xiaohongshu.count.biz.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 19:46
 * @Description: 收藏、取消收藏笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountCollectUnCollectNoteMqDTO {

    private Long userId;

    private Long noteId;

    /**
     * 0: 取消收藏， 1：收藏
     */
    private Integer type;

    private LocalDateTime createTime;
}
