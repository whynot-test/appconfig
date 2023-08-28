package com.examplebi.appconfig.auditlog.utils;

import com.examplebi.appconfig.auditlog.bean.AuditLogUser;

/**
 * @ClassName OperatorThreadUtils
 * @Description 操作人工具类
 * @Author bijunjian
 * @Date 2023/8/28 0028 9:58
 * @Version 1.0
 **/
public final class OperatorThreadUtils {

    public static final ThreadLocal<AuditLogUser> OPERATOR_THREADLOCAL = new ThreadLocal<>();

    public static final String USER_ID = "userId";

    public static final String USER_NAME = "userName";

    public static final String LOGINID = "loginId";

    public static final String CORPID = "corpId";

    public OperatorThreadUtils() {
    }
}
