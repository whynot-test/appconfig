package com.examplebi.appconfig.app.cache;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.examplebi.appconfig.app.bean.App;
import com.examplebi.appconfig.app.dao.AppDao;
import com.examplebi.appconfig.common.consts.CacheConst;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 22:56:23
 * @version: V1
 * @Description: APP 缓存
 */
@Service
@CacheConfig(cacheManager = "appconfigCacheManager")
public class AppCache {

    private static Logger log = LoggerFactory.getLogger(AppCache.class);

    @Autowired
    @Qualifier("appconfigCacheManager")
    private CacheManager cacheManager;

    @Autowired
    private AppDao appDao;

    @Caching(cacheable = {
            @Cacheable(cacheNames = CacheConst.CACHE_APP_BS ,key= "#app.cXtbs"),
            @Cacheable(cacheNames = CacheConst.CACHE_APP_BH, key = "#app.cBh")
    })
    public App insertApp(App app){
        return app;
    }

    public String  getAppBhByBs(String appBs) {
        if(StringUtils.isBlank(appBs)){
            log.error("传入的子系统标识为空");
            return null;
        }
        App app = getAppByBs(appBs);
        return app != null ? app.getcBh() : null;

    }

    public App getAppByBs(String key){
        if (StringUtils.isBlank(key)) {
            log.error("传入的子系统标识为空");
            return null;
        }
        Cache cacheBs = cacheManager.getCache(CacheConst.CACHE_APP_BS);
        Cache.ValueWrapper value = cacheBs.get(key);
        if (value != null && value.get() != null) {
            return (App)value.get();
        }
        App app = appDao.selectAppByBs(key);
        if(null != app){
            cacheBs.put(app.getcXtbs(),app);
        }
        return app;
    }


}