package com.lishuwang.xiaohongshu.data.align.domain.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/13 15:21
 * @Description: 删除
 **/
public interface DeleteMapper {

    /**
     * 日增量表：关注数计数变更 - 批量删除
     * @param userIds
     */
    void batchDeleteDataAlignFollowingCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                     @Param("userIds") List<Long> userIds);

    /**
     * 日增量表：笔记点赞计数变更 - 批量删除
     */
    void batchDeleteDataAlignNoteLikeCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                    @Param("noteIds") List<Long> noteIds);

}