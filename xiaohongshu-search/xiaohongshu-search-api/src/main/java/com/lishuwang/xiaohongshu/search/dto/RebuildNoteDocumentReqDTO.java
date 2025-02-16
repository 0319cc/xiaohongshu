package com.lishuwang.xiaohongshu.search.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/14 1:14
 * @Description: 重建笔记文档
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RebuildNoteDocumentReqDTO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}
