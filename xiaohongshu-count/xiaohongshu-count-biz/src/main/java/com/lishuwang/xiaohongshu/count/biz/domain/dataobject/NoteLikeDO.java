package com.lishuwang.xiaohongshu.count.biz.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteLikeDO {
    private Long id;

    private Long userId;

    private Long noteId;

    private LocalDateTime createTime;

    private Integer status;
}