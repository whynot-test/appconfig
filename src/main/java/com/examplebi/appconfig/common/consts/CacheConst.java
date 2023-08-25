package com.examplebi.appconfig.common.consts;

import java.lang.reflect.Field;

import com.mchange.v2.lang.StringUtils;
/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 22:35:41
 * @version: V1
 * @Description: 缓存相关常量
 */
public final class CacheConst {

    public CacheConst() {
    }

    public static final String CACHE_ENV = "appconfig:env_bs";

    public static final String CACHE_APP_BS = "appconfig:app_bs";

    public static final String CACHE_APP_BH = "appconfig:app_bh";

    public static final String CACHE_GROUP_BS2BH = "appconfig:group_bs2bh";

    public static final String CACHE_GROUP_BH2BS = "appconfig:group_bh2bs";

    public static final String CACHE_GROUPBH_APPBH = "appconfig:groupBh_appBh";

    public static final String CACHE_GROUP_QUOTE = "appconfig:group_quote";

    public static final String CACHE_CONFIG = "appconfig:configs_appbh";

    public static final String CACHE_CONFIGBH_APPH = "appconfig:configBh_appBh";

    public static final String CACHE_GLOBAL = "appconfig:global";

    public static final String CACHE_CONFIG_DELETE = "appconfig:config_delete";

    public static String[] getAllCacheNames() throws IllegalAccessException {
        Field[] declaredFields = CacheConst.class.getDeclaredFields();
        String[] result = new String[declaredFields.length];
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            result[i] = field.get(CacheConst.class).toString();
        }
        StringUtils.nonNullOrBlank("");
        return result;
    }
}