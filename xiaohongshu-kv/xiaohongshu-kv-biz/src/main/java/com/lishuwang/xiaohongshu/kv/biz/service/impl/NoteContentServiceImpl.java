package com.lishuwang.xiaohongshu.kv.biz.service.impl;

import com.lishuwang.framework.common.exception.BizException;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.kv.biz.domain.dataobject.NoteContentDO;
import com.lishuwang.xiaohongshu.kv.biz.domain.repository.NoteContentRepository;
import com.lishuwang.xiaohongshu.kv.biz.enums.ResponseCodeEnum;
import com.lishuwang.xiaohongshu.kv.biz.service.NoteContentService;
import com.lishuwang.xiaohongshu.kv.dto.req.AddNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.DeleteNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.req.FindNoteContentReqDTO;
import com.lishuwang.xiaohongshu.kv.dto.resp.FindNoteContentRspDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 12:48
 * @Description: Key-Value 业务
 **/
@Service
@Slf4j
public class NoteContentServiceImpl implements NoteContentService {

    @Resource
    private NoteContentRepository noteContentRepository;


    @Override
    public Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO) {
        // 笔记 ID
        String uuid = addNoteContentReqDTO.getUuid();
        // 笔记内容
        String content = addNoteContentReqDTO.getContent();

        // 构建数据库 DO 实体类
        NoteContentDO nodeContent = NoteContentDO.builder()
                .id(UUID.fromString(uuid))
                .content(content)
                .build();

        // 插入数据
        noteContentRepository.save(nodeContent);

        return Response.success();
    }

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    @Override
    public Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO) {
        // 笔记 ID
        String uuid = findNoteContentReqDTO.getUuid();
        // 根据笔记 ID 查询笔记内容
        Optional<NoteContentDO> optional = noteContentRepository.findById(UUID.fromString(uuid));

        // 若笔记内容不存在
        if (!optional.isPresent()) {
            throw new BizException(ResponseCodeEnum.NOTE_CONTENT_NOT_FOUND);
        }

        NoteContentDO noteContentDO = optional.get();
        // 构建返参 DTO
        FindNoteContentRspDTO findNoteContentRspDTO = FindNoteContentRspDTO.builder()
                .uuid(noteContentDO.getId())
                .content(noteContentDO.getContent())
                .build();

        return Response.success(findNoteContentRspDTO);
    }

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    @Override
    public Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO) {
        // 笔记 ID
        String uuid = deleteNoteContentReqDTO.getUuid();
        // 删除笔记内容
        noteContentRepository.deleteById(UUID.fromString(uuid));

        return Response.success();
    }
}
