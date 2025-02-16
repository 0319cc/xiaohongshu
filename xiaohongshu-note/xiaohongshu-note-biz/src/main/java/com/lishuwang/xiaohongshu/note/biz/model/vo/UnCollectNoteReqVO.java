package com.lishuwang.xiaohongshu.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/15 18:34
 * @Description: 取消收藏笔记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnCollectNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}