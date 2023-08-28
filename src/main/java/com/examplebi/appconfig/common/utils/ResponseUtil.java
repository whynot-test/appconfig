package com.examplebi.appconfig.common.utils;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.examplebi.appconfig.common.bean.AppconfigExternalResponse;
import com.examplebi.appconfig.common.bean.AppconfigResponse;
import com.examplebi.appconfig.common.bean.ResponseData;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 16:21:21
 * @version: V1
 * @Description: 响应工具类，将不同类型的相应对象转化为json格式的字符串，同样也设置了日期格式和序列化特性
 */
public final class ResponseUtil {

    /**
     * 为了确保这个工具类不能被实例化，工具类不需要实例化
     */
    public ResponseUtil() {
        throw new IllegalStateException("Utility class");
    }

    private static SerializeConfig mapping = new SerializeConfig();

    private static final String DATAFORMAT_TIME = "yyyy-MM-dd HH:mm:ss";

    public static String toString(AppconfigResponse appconfigResponse) {
        if (appconfigResponse == null) {
            return null;
        }
        JSON.DEFFAULT_DATE_FORMAT = DATAFORMAT_TIME;
        mapping.put(Date.class, new SimpleDateFormatSerializer(DATAFORMAT_TIME));
        return JSONObject.toJSONString(
                appconfigResponse,
                mapping,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect);
    }

    public static String toString(ResponseData responseData){
        if (responseData == null) {
            return null;
        }
        JSON.DEFFAULT_DATE_FORMAT = DATAFORMAT_TIME;
        mapping.put(Date.class, new SimpleDateFormatSerializer(DATAFORMAT_TIME));
        return JSONObject.toJSONString(
                responseData,
                mapping,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect
        );
    }
    public static String toString(AppconfigExternalResponse appconfigV1Response) {
        if (appconfigV1Response == null) {
            return null;
        }
        JSON.DEFFAULT_DATE_FORMAT = DATAFORMAT_TIME;
        mapping.put(Date.class, new SimpleDateFormatSerializer(DATAFORMAT_TIME));
        return JSONObject.toJSONString(
                appconfigV1Response,
                mapping,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect
        );
    }

}