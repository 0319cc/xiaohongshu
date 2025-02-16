package com.lishuwang.xiaohongshu.user.relation.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 17:15
 * @Description: 取关用户
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnfollowUserReqVO {

    @NotNull(message = "被取关用户 ID 不能为空")
    private Long unfollowUserId;
}
