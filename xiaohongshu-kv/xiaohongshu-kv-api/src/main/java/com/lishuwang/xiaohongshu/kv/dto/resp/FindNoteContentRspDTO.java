package com.lishuwang.xiaohongshu.kv.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 15:27
 * @Description: 笔记内容
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindNoteContentRspDTO {

    /**
     * 笔记内容 UUID
     */
    private UUID uuid;

    /**
     * 笔记内容
     */
    private String content;

}
