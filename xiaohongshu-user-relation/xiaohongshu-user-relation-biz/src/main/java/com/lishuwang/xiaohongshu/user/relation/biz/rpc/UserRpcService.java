package com.lishuwang.xiaohongshu.user.relation.biz.rpc;

import cn.hutool.core.collection.CollUtil;
import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.user.api.UserFeignApi;
import com.lishuwang.xiaohongshu.user.dto.req.FindUserByIdReqDTO;
import com.lishuwang.xiaohongshu.user.dto.req.FindUsersByIdsReqDTO;
import com.lishuwang.xiaohongshu.user.dto.resp.FindUserByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/13 14:39
 * @Description: 用户服务
 **/
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 根据用户 ID 查询
     *
     * @param userId
     * @return
     */
    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (!response.isSuccess() || Objects.isNull(response.getData())) {
            return null;
        }

        return response.getData();
    }

    /**
     * 批量查询用户信息
     *
     * @param userIds
     * @return
     */
    public List<FindUserByIdRspDTO> findByIds(List<Long> userIds) {
        FindUsersByIdsReqDTO findUsersByIdsReqDTO = new FindUsersByIdsReqDTO();
        findUsersByIdsReqDTO.setIds(userIds);

        Response<List<FindUserByIdRspDTO>> response = userFeignApi.findByIds(findUsersByIdsReqDTO);

        if (!response.isSuccess() || Objects.isNull(response.getData()) || CollUtil.isEmpty(response.getData())) {
            return null;
        }

        return response.getData();
    }



}
