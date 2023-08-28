package com.examplebi.appconfig.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName Md5Util
 * @Description TODO
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:15
 * @Version 1.0
 **/
public final class Md5Util {

    private static final Logger logger = LoggerFactory.getLogger(Md5Util.class);

    /**
     * 获取当前字符串的 32位小写md5
     * @param str
     * @return
     *
     *
     * MessageDigest:是Java提供的用于哈希计算的类
     */
    public static String getMD5(String str) {
        try {
            //获取MD5哈希算法的实例
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //将字符串转换为字节数组，并将其传递给MD5算法实例进行哈希计算
            md5.update(str.getBytes(Charset.forName("UTF-8")));
            int i;
            StringBuilder sb = new StringBuilder();

            //迭代处理MD5算法计算的哈希值的每个字节
            for (byte bt : md5.digest()) {
                i = bt;
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            logger.error("获取MD5出错", e);
            return null;
        }
    }
}
