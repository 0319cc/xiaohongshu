package com.lishuwang.xiaohongshu.search.biz.service;

import com.lishuwang.framework.common.response.PageResponse;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchNoteReqVO;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchNoteRspVO;
import com.lishuwang.xiaohongshu.search.dto.RebuildNoteDocumentReqDTO;

/**
 * @author: shuwang Li
 * @version: v1.0.0
 * @description: 笔记搜索业务
 **/
public interface NoteService {

    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);

    /**
     * 重建笔记文档
     * @param rebuildNoteDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO);
}
