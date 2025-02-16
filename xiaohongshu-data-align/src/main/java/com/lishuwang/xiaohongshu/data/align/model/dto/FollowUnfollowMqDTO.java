package com.lishuwang.xiaohongshu.data.align.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 15:05
 * @Description: 用户关注、取关
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowUnfollowMqDTO {

    /**
     * 原用户
     */
    private Long userId;

    /**
     * 目标用户
     */
    private Long targetUserId;

    /**
     * 1:关注 0:取关
     */
    private Integer type;

}