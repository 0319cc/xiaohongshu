package com.lishuwang.xiaohongshu.distributed.id.generator.biz.core;

import com.lishuwang.xiaohongshu.distributed.id.generator.biz.core.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
