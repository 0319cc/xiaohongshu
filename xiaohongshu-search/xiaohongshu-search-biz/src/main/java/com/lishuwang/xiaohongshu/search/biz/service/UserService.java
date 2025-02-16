package com.lishuwang.xiaohongshu.search.biz.service;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.framework.common.response.PageResponse;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchUserReqVO;
import com.lishuwang.xiaohongshu.search.biz.model.vo.SearchUserRspVO;
import com.lishuwang.xiaohongshu.search.dto.RebuildUserDocumentReqDTO;

/**
 * @author: 犬小哈
 * @date: 2024/4/7 15:41
 * @version: v1.0.0
 * @description: 用户搜索业务
 **/
public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);

    /**
     * 重建用户文档
     * @param rebuildUserDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO);
}
