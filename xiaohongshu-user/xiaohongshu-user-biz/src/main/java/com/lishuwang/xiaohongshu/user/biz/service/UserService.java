package com.lishuwang.xiaohongshu.user.biz.service;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.user.biz.model.vo.UpdateUserInfoReqVO;
import com.lishuwang.xiaohongshu.user.dto.req.*;
import com.lishuwang.xiaohongshu.user.dto.resp.FindUserByIdRspDTO;
import com.lishuwang.xiaohongshu.user.dto.resp.FindUserByPhoneRspDTO;

import java.util.List;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 1:23
 * @Description: 用户业务
 **/
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);

    /**
     * 根据手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    Response<FindUserByPhoneRspDTO> findByPhone(FindUserByPhoneReqDTO findUserByPhoneReqDTO);

    /**
     * 更新密码
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);

    /**
     * 根据用户 ID 查询用户信息
     *
     * @param findUserByIdReqDTO
     * @return
     */
    Response<FindUserByIdRspDTO> findById(FindUserByIdReqDTO findUserByIdReqDTO);

    /**
     * 批量根据用户 ID 查询用户信息
     *
     * @param findUsersByIdsReqDTO
     * @return
     */
    Response<List<FindUserByIdRspDTO>> findByIds(FindUsersByIdsReqDTO findUsersByIdsReqDTO);

}
