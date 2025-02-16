package com.lishuwang.xiaohongshu.note.biz.rpc;

import com.lishuwang.xiaohongshu.distributed.id.generator.api.DistributedIdGeneratorFeignApi;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/12 20:20
 * @Description: 用户服务
 **/
@Component
public class DistributedIdGeneratorRpcService {

    @Resource
    private DistributedIdGeneratorFeignApi distributedIdGeneratorFeignApi;

    /**
     * 生成雪花算法 ID
     * 入参可以随便填
     * @return
     */
    public String getSnowflakeId() {
        return distributedIdGeneratorFeignApi.getSnowflakeId("test");
    }

}
