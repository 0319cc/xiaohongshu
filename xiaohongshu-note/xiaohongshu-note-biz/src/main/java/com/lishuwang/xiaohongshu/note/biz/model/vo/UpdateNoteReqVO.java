package com.lishuwang.xiaohongshu.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 11:36
 * @Description: 笔记修改
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

    @NotNull(message = "笔记类型不能为空")
    private Integer type;

    private List<String> imgUris;

    private String videoUri;

    private String title;

    private String content;

    private Long topicId;
}

