package com.examplebi.appconfig.app.dao;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

import com.examplebi.appconfig.app.bean.App;
import com.examplebi.appconfig.app.dao.mapper.AppMapper;
import com.examplebi.appconfig.common.consts.CacheConst;
import com.examplebi.appconfig.common.dao.BaseDao;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 22:59:54
 * @version: V1
 * @Description: 子系统DAO层
 */
public class AppDao extends BaseDao {

    @Autowired
    private AppMapper appMapper;

    public App selectAppByBs(String bs) {
        return appMapper.selectAppByBs(bs);
    }
}