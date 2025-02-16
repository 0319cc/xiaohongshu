package com.lishuwang.xiaohongshu.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 12:20
 * @Description: 笔记仅对自己可见
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateNoteVisibleOnlyMeReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}
