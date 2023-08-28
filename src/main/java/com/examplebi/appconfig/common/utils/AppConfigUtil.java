package com.examplebi.appconfig.common.utils;

import com.examplebi.appconfig.common.consts.CommonConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName AppConfigUtil
 * @Description 获取时间戳
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:00
 * @Version 1.0
 **/
public final class AppConfigUtil {

    private static final Logger logger = LoggerFactory.getLogger(AppConfigUtil.class);

    public static Timestamp getTimestamp() {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(CommonConst.C_DATE_FORMAT);
        String curDateStr =  sdf.format(date);
        try{
            timestamp = Timestamp.valueOf(curDateStr);
        }catch (Exception e){
            logger.error("获取TimeStamp格式的当前日期出错！",e);
        }
        return timestamp;
    }
}
