package com.lishuwang.xiaohongshu.user.relation.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 17:42
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindFollowingListReqVO {

    @NotNull(message = "查询用户 ID 不能为空")
    private Long userId;

    @NotNull(message = "页码不能为空")
    private Integer pageNo = 1; // 默认值为第一页
}
