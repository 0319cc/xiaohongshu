package com.lishuwang.xiaohongshu.user.relation.biz.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 17:55
 * @Description: 查询关注列表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindFansUserRspVO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 粉丝总数
     */
    private Long fansTotal;

    /**
     * 笔记总数
     */
    private Long noteTotal;

}
