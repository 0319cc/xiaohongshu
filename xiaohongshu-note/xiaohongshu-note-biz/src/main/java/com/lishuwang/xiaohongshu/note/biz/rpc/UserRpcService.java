package com.lishuwang.xiaohongshu.note.biz.rpc;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.user.api.UserFeignApi;
import com.lishuwang.xiaohongshu.user.dto.req.FindUserByIdReqDTO;
import com.lishuwang.xiaohongshu.user.dto.resp.FindUserByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 21:34
 * @Description: 用户服务
 **/
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

}