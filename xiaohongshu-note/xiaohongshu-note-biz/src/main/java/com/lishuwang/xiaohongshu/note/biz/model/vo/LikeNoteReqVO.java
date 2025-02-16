package com.lishuwang.xiaohongshu.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 14:51
 * @Description: 点赞笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikeNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}
