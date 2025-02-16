package com.lishuwang.xiaohongshu.auth.alarm.impl;

import com.lishuwang.xiaohongshu.auth.alarm.AlarmInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/10 0:44
 * @Description: TODO
 **/
@Slf4j
public class SmsAlarmHelper implements AlarmInterface {

    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    @Override
    public boolean send(String message) {
        log.info("==> 【短信告警】：{}", message);

        // 业务逻辑...

        return true;
    }
}
