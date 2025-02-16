package com.lishuwang.xiaohongshu.oss.biz.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 0:42
 * @Description: 文件策略接口
 **/
public interface FileStrategy {

    /**
     * 文件上传
     *
     * @param file
     * @param bucketName
     * @return
     */
    String uploadFile(MultipartFile file, String bucketName);

}