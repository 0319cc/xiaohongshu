package com.lishuwang.xiaohongshu.note.biz.domain.mapper;

import com.lishuwang.xiaohongshu.note.biz.domain.dataobject.ChanneTopicRelDO;

public interface ChanneTopicRelDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChanneTopicRelDO record);

    int insertSelective(ChanneTopicRelDO record);

    ChanneTopicRelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChanneTopicRelDO record);

    int updateByPrimaryKey(ChanneTopicRelDO record);
}