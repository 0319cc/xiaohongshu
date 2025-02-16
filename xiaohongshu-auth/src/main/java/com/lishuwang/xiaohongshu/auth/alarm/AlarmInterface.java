package com.lishuwang.xiaohongshu.auth.alarm;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/10 0:44
 * @Description: TODO
 **/
public interface AlarmInterface {

    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    boolean send(String message);
}