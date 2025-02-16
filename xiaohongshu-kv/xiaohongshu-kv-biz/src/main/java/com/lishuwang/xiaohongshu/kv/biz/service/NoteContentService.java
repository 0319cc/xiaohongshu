package com.lishuwang.xiaohongshu.kv.biz.service;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.kv.dto.req.AddNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.DeleteNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.FindNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.resp.FindNoteContentRspDTO;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 12:47
 * @Description: 笔记内容存储业务
 **/
public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);


    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);


}
