package com.lishuwang.xiaohongshu.user.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 11:44
 * @Description: 根据手机号查询用户信息
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserByPhoneRspDTO {

    private Long id;

    private String password;

}
