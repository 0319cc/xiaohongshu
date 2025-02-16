package com.lishuwang.xiaohongshu.search.biz.controller;

import com.lishuwang.framework.biz.operationlog.aspect.ApiOperationLog;
import com.lishuwang.framework.common.response.PageResponse;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchNoteReqVO;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchNoteRspVO;
import com.lishuwang.xiaohongshu.search.biz.service.NoteService;
import com.lishuwang.xiaohongshu.search.dto.RebuildNoteDocumentReqDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: shuwang Li
 * @date: 2024/4/4 13:22
 * @version: v1.0.0
 * @description: 笔记搜索
 **/
@RestController
@RequestMapping("/search")
@Slf4j
public class NoteController {

    @Resource
    private NoteService noteService;

    @PostMapping("/note")
    @ApiOperationLog(description = "搜索笔记")
    public PageResponse<SearchNoteRspVO> searchNote(@RequestBody @Validated SearchNoteReqVO searchNoteReqVO) {
        return noteService.searchNote(searchNoteReqVO);
    }

    // ===================================== 对其他服务提供的接口 =====================================
    @PostMapping("/note/document/rebuild")
    @ApiOperationLog(description = "用户文档重建")
    public Response<Long> rebuildDocument(@Validated @RequestBody RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO) {
        return noteService.rebuildDocument(rebuildNoteDocumentReqDTO);
    }

}
