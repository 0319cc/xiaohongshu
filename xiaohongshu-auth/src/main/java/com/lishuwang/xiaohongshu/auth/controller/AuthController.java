package com.lishuwang.xiaohongshu.auth.controller;

import com.lishuwang.framework.biz.operationlog.aspect.ApiOperationLog;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.auth.model.vo.user.UpdatePasswordReqVO;
import com.lishuwang.xiaohongshu.auth.model.vo.user.UserLoginReqVO;
import com.lishuwang.xiaohongshu.auth.service.AuthService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/9 23:24
 * @Description: TODO
 **/
@RestController
@Slf4j
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录/注册")
    public Response<String> loginAndRegister(@Validated @RequestBody UserLoginReqVO userLoginReqVO) {
        return authService.loginAndRegister(userLoginReqVO);
    }

    @PostMapping("/logout")
    @ApiOperationLog(description = "账号登出")
    public Response<?> logout() {
        return authService.logout();
    }

    @PostMapping("/password/update")
    @ApiOperationLog(description = "修改密码")
    public Response<?> updatePassword(@Validated @RequestBody UpdatePasswordReqVO updatePasswordReqVO) {
        return authService.updatePassword(updatePasswordReqVO);
    }
}
