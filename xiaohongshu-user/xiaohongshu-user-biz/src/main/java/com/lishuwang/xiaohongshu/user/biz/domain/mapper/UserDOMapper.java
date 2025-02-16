package com.lishuwang.xiaohongshu.user.biz.domain.mapper;

import com.lishuwang.xiaohongshu.user.biz.domain.dataobject.PermissionDO;
import com.lishuwang.xiaohongshu.user.biz.domain.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    /**
     * 根据手机号查询记录
     * @param phone
     * @return
     */
    UserDO selectByPhone(String phone);

    /**
     * 批量查询用户信息
     *
     * @param ids
     * @return
     */
    List<UserDO> selectByIds(@Param("ids") List<Long> ids);
}