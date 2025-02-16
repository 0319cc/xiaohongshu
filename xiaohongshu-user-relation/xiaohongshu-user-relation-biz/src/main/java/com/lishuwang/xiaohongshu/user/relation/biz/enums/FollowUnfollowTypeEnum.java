package com.lishuwang.xiaohongshu.user.relation.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 12:27
 * @Description: 关注、取关 Type
 **/
@Getter
@AllArgsConstructor
public enum FollowUnfollowTypeEnum {
    // 关注
    FOLLOW(1),
    // 取关
    UNFOLLOW(0),
    ;

    private final Integer code;

}
