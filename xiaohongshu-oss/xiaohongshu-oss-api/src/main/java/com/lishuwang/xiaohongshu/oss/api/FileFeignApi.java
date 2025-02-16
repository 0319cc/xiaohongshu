package com.lishuwang.xiaohongshu.oss.api;

import com.lishuwang.framework.common.response.Response;
import com.lishuwang.xiaohongshu.oss.config.FeignFormConfig;
import com.lishuwang.xiaohongshu.oss.constant.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/11 1:46
 * @Description: TODO
 **/
@FeignClient(name = ApiConstants.SERVICE_NAME, configuration = FeignFormConfig.class)
public interface FileFeignApi {

    String PREFIX = "/file";

    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    @PostMapping(value = PREFIX + "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Response<?> uploadFile(@RequestPart(value = "file") MultipartFile file);

}