package com.lishuwang.xiaohongshu.user.biz.constant;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:11
 * @Description: Redis 常量类
 **/
public class RedisKeyConstants {

    /**
     * 小红书全局 ID 生成器 KEY
     */
    public static final String XIAOHONGSHU_ID_GENERATOR_KEY = "xiaohongshu.id.generator";

    /**
     * 用户角色数据 KEY 前缀
     */
    private static final String USER_ROLES_KEY_PREFIX = "user:roles:";

    /**
     * 角色对应的权限集合 KEY 前缀
     */
    private static final String ROLE_PERMISSIONS_KEY_PREFIX = "role:permissions:";

    /**
     * 用户对应的角色集合 KEY
     * @param userId
     * @return
     */
    public static String buildUserRoleKey(Long userId) {
        return USER_ROLES_KEY_PREFIX + userId;
    }

    /**
     * 构建角色对应的权限集合 KEY
     * @param roleKey
     * @return
     */
    public static String buildRolePermissionsKey(String roleKey) {
        return ROLE_PERMISSIONS_KEY_PREFIX + roleKey;
    }

    /**
     * 用户信息数据 KEY 前缀
     */
    private static final String USER_INFO_KEY_PREFIX = "user:info:";


    /**
     * 构建角色对应的权限集合 KEY
     * @param userId
     * @return
     */
    public static String buildUserInfoKey(Long userId) {
        return USER_INFO_KEY_PREFIX + userId;
    }
}
