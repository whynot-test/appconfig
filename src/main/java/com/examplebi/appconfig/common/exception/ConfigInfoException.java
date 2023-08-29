package com.examplebi.appconfig.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 22:43:19
 * @version: V1
 * @Description: 配置异常类
 */
public class ConfigInfoException extends Exception {

    private static final long serialVersionUID = 2816548415489632314L;

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigInfoException.class);

    public ConfigInfoException(String message) {
        super(message);
    }

    /**
     * @param message 异常消息
     * @param cause   异常原因
     */
    public ConfigInfoException(String message, Throwable cause) {
        super(message, cause);
        LOGGER.warn(message);
    }
}