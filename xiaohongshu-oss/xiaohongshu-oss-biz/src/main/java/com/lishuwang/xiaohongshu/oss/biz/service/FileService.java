package com.lishuwang.xiaohongshu.oss.biz.service;

import com.lishuwang.framework.common.response.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:45
 * @Description: TODO
 **/
public interface FileService {

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    Response<?> uploadFile(MultipartFile file);
}