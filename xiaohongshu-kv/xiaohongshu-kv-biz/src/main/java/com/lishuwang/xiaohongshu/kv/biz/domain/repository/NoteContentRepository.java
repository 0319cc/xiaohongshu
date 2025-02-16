package com.lishuwang.xiaohongshu.kv.biz.domain.repository;

import com.lishuwang.xiaohongshu.kv.biz.domain.dataobject.NoteContentDO;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 12:24
 * @Description: TODO
 **/
public interface NoteContentRepository extends CassandraRepository<NoteContentDO, UUID> {

}
