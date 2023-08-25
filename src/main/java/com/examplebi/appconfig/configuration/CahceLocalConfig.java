package com.examplebi.appconfig.configuration;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.examplebi.appconfig.common.consts.CacheConst;
import com.github.benmanes.caffeine.cache.Caffeine;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 23:43:45
 * @version: V1
 * @Description:
 */
@Configuration
@ConditionalOnProperty(name = "appconfig.cache.mode" ,havingValue = "local")
public class CahceLocalConfig {

    @Bean("appconfigCacheManager")
    @Primary
    public CacheManager appconfigCacheManager() throws IllegalAccessException {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        ArrayList<CaffeineCache> caches = new ArrayList<>();
        String[] allCacheNames = CacheConst.getAllCacheNames();
        for (String cacheName : allCacheNames) {
            caches.add(new CaffeineCache(cacheName, Caffeine.newBuilder().recordStats().build()));

        }
        cacheManager.setCaches(caches);
        return cacheManager;
    }
}