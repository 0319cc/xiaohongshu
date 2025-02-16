package com.lishuwang.xiaohongshu.count.biz.constant;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 12:40
 * @Description: TODO
 **/
public class RedisKeyConstants {

    /**
     * 用户维度计数 Key 前缀
     */
    private static final String COUNT_USER_KEY_PREFIX = "count:user:";

    /**
     * Hash Field: 粉丝总数
     */
    public static final String FIELD_FANS_TOTAL = "fansTotal";


    /**
     * 构建用户维度计数 Key
     * @param userId
     * @return
     */
    public static String buildCountUserKey(Long userId) {
        return COUNT_USER_KEY_PREFIX + userId;
    }

    /**
     * Hash Field: 关注总数
     */
    public static final String FIELD_FOLLOWING_TOTAL = "followingTotal";

    /**
     * 笔记维度计数 Key 前缀
     */
    private static final String COUNT_NOTE_KEY_PREFIX = "count:note:";

    /**
     * Hash Field: 笔记点赞总数
     */
    public static final String FIELD_LIKE_TOTAL = "likeTotal";

    /**
     * 构建笔记维度计数 Key
     * @param noteId
     * @return
     */
    public static String buildCountNoteKey(Long noteId) {
        return COUNT_NOTE_KEY_PREFIX + noteId;
    }

    /**
     * Hash Field: 笔记收藏总数
     */
    public static final String FIELD_COLLECT_TOTAL = "collectTotal";


    /**
     * Hash Field: 笔记发布总数
     */
    public static final String FIELD_NOTE_TOTAL = "noteTotal";

}

