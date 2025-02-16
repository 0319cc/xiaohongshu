package com.lishuwang.xiaohongshu.auth.model.vo.verificationcode;

import com.lishuwang.framework.common.validator.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/8 23:10
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendVerificationCodeReqVO {

    @NotBlank(message = "手机号不能为空")
    @PhoneNumber
    private String phone;

}

