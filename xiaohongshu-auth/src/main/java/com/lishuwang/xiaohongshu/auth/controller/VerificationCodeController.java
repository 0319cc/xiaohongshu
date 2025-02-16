package com.lishuwang.xiaohongshu.auth.controller;

import com.lishuwang.framework.biz.operationlog.aspect.ApiOperationLog;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;
import com.lishuwang.xiaohongshu.auth.service.VerificationCodeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:16
 * @Description: TODO
 **/

@RestController
@Slf4j
public class VerificationCodeController {

    @Resource
    private VerificationCodeService verificationCodeService;

    @PostMapping("/verification/code/send")
    @ApiOperationLog(description = "发送短信验证码")
    public Response<?> send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return verificationCodeService.send(sendVerificationCodeReqVO);
    }

}
