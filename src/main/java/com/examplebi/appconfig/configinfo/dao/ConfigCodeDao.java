package com.examplebi.appconfig.configinfo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examplebi.appconfig.configinfo.ConfigCode;
import com.examplebi.appconfig.configinfo.dao.mapper.ConfigCodeMapper;
import com.examplebi.appconfig.configinfo.dao.mapper.ConfigInfoMapper;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:16:44
 * @version: V1
 * @Description:
 */
@Repository
public class ConfigCodeDao {

    @Autowired
    private ConfigCodeMapper configCodeMapper;

    @Autowired
    private ConfigInfoMapper ConfigInfoMapepr;

    /**
     * 查询全部的配置代码
     * @return
     */
    public List<ConfigCode> selectAllConfigCode(){
        return configCodeMapper.selectAllConfigCode();
    }
}