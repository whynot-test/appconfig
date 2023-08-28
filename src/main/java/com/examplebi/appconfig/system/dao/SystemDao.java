package com.examplebi.appconfig.system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examplebi.appconfig.common.dao.BaseDao;
import com.examplebi.appconfig.system.bean.System;
import com.examplebi.appconfig.system.dao.mapper.SystemMapper;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 15:48:29
 * @version: V1
 * @Description:
 */
@Repository
public class SystemDao extends BaseDao {

    @Autowired
    private SystemMapper systemMapper;

    public void insertSystem(System system){
        systemMapper.insertSystem(system);
    }

    public System selectSystemById(String id){
        return systemMapper.selectSystemBySystemId(id);
    }

    public List<System> selectSystemsByIds(List<String> ids){
        return systemMapper.selectSystemByIds(ids);
    }

    public void updateSystem(System system){
        systemMapper.updateSystemById(system);
    }

    public List<System> selectAllSystem(){
        return systemMapper.selectAllSystem(isDmDataBase());
    }

    public List<System> selectSystem(String userId, String name){
        return systemMapper.selectSystem(userId,name, isDmDataBase());
    }

    public void deleteSystem(String id){
        systemMapper.deleteSystemById(id);
    }
}