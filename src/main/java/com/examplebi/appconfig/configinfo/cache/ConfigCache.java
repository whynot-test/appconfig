package com.examplebi.appconfig.configinfo.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.examplebi.appconfig.common.consts.CacheConst;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:11:14
 * @version: V1
 * @Description:
 */
@Service
@CacheConfig(cacheManager = "appconfigCacheManager",cacheNames = CacheConst.CACHE_CONFIG)
public class ConfigCache {

    private static Logger logger = LoggerFactory.getLogger(ConfigCache.class);

    @Autowired
    private ConfigCache configCache;

    @Autowired
    @Qualifier("appconfigCacheManager")
    private CacheManager cacheManager;

//    private ConfigInfoDao

}