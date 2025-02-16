package com.lishuwang.xiaohongshu.auth.service;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:13
 * @Description: TODO
 **/
public interface VerificationCodeService {

    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}