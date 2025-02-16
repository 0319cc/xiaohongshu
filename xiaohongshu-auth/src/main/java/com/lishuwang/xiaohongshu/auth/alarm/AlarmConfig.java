package com.lishuwang.xiaohongshu.auth.alarm;

import com.lishuwang.xiaohongshu.auth.alarm.impl.MailAlarmHelper;
import com.lishuwang.xiaohongshu.auth.alarm.impl.SmsAlarmHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuwang Li
 * @Date: 2025/1/10 0:45
 * @Description: TODO
 **/

@Configuration
@RefreshScope
public class AlarmConfig {

    @Value("${alarm.type}")
    private String alarmType;

    @Bean
    public AlarmInterface alarmHelper() {
        // 根据配置文件中的告警类型，初始化选择不同的告警实现类
        if (StringUtils.equals("sms", alarmType)) {
            return new SmsAlarmHelper();
        } else if (StringUtils.equals("mail", alarmType)) {
            return new MailAlarmHelper();
        } else {
            throw new IllegalArgumentException("错误的告警类型...");
        }
    }
}
