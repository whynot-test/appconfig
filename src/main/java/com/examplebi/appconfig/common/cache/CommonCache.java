package com.examplebi.appconfig.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examplebi.appconfig.app.cache.AppCache;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 22:53:57
 * @version: V1
 * @Description: 公用缓存类
 */
@Component

public class CommonCache {

    @Autowired
    private AppCache appcache;

//    @Autowired
//    private GroupCache groupCache;


}