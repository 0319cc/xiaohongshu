package com.lishuwang.xiaohongshu.search.api;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.search.constant.ApiConstants;
import com.lishuwang.xiaohongshu.search.dto.RebuildNoteDocumentReqDTO;
import com.lishuwang.xiaohongshu.search.dto.RebuildUserDocumentReqDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/14 1:14
 * @Description: TODO
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface SearchFeignApi {

    String PREFIX = "/search";

    /**
     * 重建笔记文档
     * @param rebuildNoteDocumentReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/note/document/rebuild")
    Response<?> rebuildNoteDocument(@RequestBody RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO);


    /**
     * 重建用户文档
     * @param rebuildUserDocumentReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/user/document/rebuild")
    Response<?> rebuildUserDocument(@RequestBody RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO);

}
