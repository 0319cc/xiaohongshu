package com.lishuwang.xiaohongshu.data.align.domain.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 15:18
 * @Description: 更新
 **/
public interface UpdateMapper {

    /**
     * 更新 t_user_count 计数表总关注数
     * @param userId
     * @return
     */
    int updateUserFollowingTotalByUserId(@Param("userId") long userId,
                                         @Param("followingTotal") int followingTotal);

    /**
     * 更新 t_note_count 计数表笔记点赞数
     */
    int updateNoteLikeTotalByUserId(@Param("noteId") long noteId,
                                    @Param("noteLikeTotal") int noteLikeTotal);
}