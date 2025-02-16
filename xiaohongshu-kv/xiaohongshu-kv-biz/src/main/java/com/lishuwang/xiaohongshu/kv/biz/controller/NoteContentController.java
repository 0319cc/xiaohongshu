package com.lishuwang.xiaohongshu.kv.biz.controller;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.kv.biz.service.NoteContentService;
import com.lishuwang.xiaohongshu.kv.dto.req.AddNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.DeleteNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.FindNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.resp.FindNoteContentRspDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 12:49
 * @Description: 笔记内容
 **/
@RestController
@RequestMapping("/kv")
@Slf4j
public class NoteContentController {

    @Resource
    private NoteContentService noteContentService;

    @PostMapping(value = "/note/content/add")
    public Response<?> addNoteContent(@Validated @RequestBody AddNoteContentReqDTO addNoteContentReqDTO) {
        return noteContentService.addNoteContent(addNoteContentReqDTO);
    }

    @PostMapping(value = "/note/content/find")
    public Response<FindNoteContentRspDTO> findNoteContent(@Validated @RequestBody FindNoteContentReqDTO findNoteContentReqDTO) {
        return noteContentService.findNoteContent(findNoteContentReqDTO);
    }

    @PostMapping(value = "/note/content/delete")
    public Response<?> deleteNoteContent(@Validated @RequestBody DeleteNoteContentReqDTO deleteNoteContentReqDTO) {
        return noteContentService.deleteNoteContent(deleteNoteContentReqDTO);
    }

}