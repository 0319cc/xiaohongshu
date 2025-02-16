package com.lishuwang.xiaohongshu.user.relation.biz.constant;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 14:48
 * @Description: TODO
 **/
public class RedisKeyConstants {

    /**
     * 关注列表 KEY 前缀
     */
    private static final String USER_FOLLOWING_KEY_PREFIX = "following:";

    /**
     * 构建关注列表完整的 KEY
     * @param userId
     * @return
     */
    public static String buildUserFollowingKey(Long userId) {
        return USER_FOLLOWING_KEY_PREFIX + userId;
    }

    /**
     * 粉丝列表 KEY 前缀
     */
    private static final String USER_FANS_KEY_PREFIX = "fans:";

    // 省略...

    /**
     * 构建粉丝列表完整的 KEY
     * @param userId
     * @return
     */
    public static String buildUserFansKey(Long userId) {
        return USER_FANS_KEY_PREFIX + userId;
    }


}
