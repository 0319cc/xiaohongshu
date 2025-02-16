package com.lishuwang.xiaohongshu.kv.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 15:27
 * @Description: 查询笔记内容
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindNoteContentReqDTO {

    @NotBlank(message = "笔记内容 UUID 不能为空")
    private String uuid;

}