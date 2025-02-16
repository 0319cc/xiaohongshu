package com.lishuwang.xiaohongshu.user.relation.biz.service;

import com.lishuwang.framework.common.response.PageResponse;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.user.relation.biz.model.vo.*;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 14:35
 * @Description: 关注业务
 **/
public interface RelationService {

    /**
     * 关注用户
     * @param followUserReqVO
     * @return
     */
    Response<?> follow(FollowUserReqVO followUserReqVO);

    /**
     * 取关用户
     * @param unfollowUserReqVO
     * @return
     */
    Response<?> unfollow(UnfollowUserReqVO unfollowUserReqVO);

    /**
     * 查询关注列表
     * @param findFollowingListReqVO
     * @return
     */
    PageResponse<FindFollowingUserRspVO> findFollowingList(FindFollowingListReqVO findFollowingListReqVO);

    /**
     * 查询关注的粉丝列表
     * @param findFansListReqVO
     * @return
     */
    PageResponse<FindFansUserRspVO> findFansList(FindFansListReqVO findFansListReqVO);

}