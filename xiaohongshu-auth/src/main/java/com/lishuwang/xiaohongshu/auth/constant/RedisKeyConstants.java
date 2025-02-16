package com.lishuwang.xiaohongshu.auth.constant;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:11
 * @Description: Redis 常量类
 **/
public class RedisKeyConstants {

    /**
     * 验证码 KEY 前缀
     */
    private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code:";


    /**
     * 构建验证码 KEY
     * @param phone
     * @return
     */
    public static String buildVerificationCodeKey(String phone) {
        return VERIFICATION_CODE_KEY_PREFIX + phone;
    }

}
