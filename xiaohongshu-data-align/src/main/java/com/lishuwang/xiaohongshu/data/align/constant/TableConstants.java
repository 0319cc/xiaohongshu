package com.lishuwang.xiaohongshu.data.align.constant;

/**
 * @Author: ShuWang Li
 * @Date: 2025/2/12 22:17
 * @Description: 表常量类
 **/
public class TableConstants {

    /**
     * 表名中的分隔符
     */
    private static final String TABLE_NAME_SEPARATE = "_";

    /**
     * 拼接表名后缀
     * @param hashKey
     * @return
     */
    public static String buildTableNameSuffix(String date, long hashKey) {
        // 拼接完整的表名
        return date + TABLE_NAME_SEPARATE + hashKey;
    }

}