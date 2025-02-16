package com.lishuwang.xiaohongshu.oss.biz.service.impl;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.oss.biz.service.FileService;
import com.lishuwang.xiaohongshu.oss.biz.strategy.FileStrategy;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:46
 * @Description: TODO
 **/
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Resource
    private FileStrategy fileStrategy;

    private static final String BUCKET_NAME = "xiaohongshu";

    @Override
    public Response<?> uploadFile(MultipartFile file) {
        // 上传文件
        String url = fileStrategy.uploadFile(file, BUCKET_NAME);

        return Response.success(url);
    }
}