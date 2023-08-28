package com.examplebi.appconfig.system.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplebi.appconfig.common.utils.UuidUtil;
import com.examplebi.appconfig.system.bean.Authority;
import com.examplebi.appconfig.system.bean.System;
import com.examplebi.appconfig.system.dao.AuthorityDao;
import com.examplebi.appconfig.system.dao.SystemDao;
import com.examplebi.appconfig.system.dao.mapper.SystemMapper;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 16:42:57
 * @version: V1
 * @Description:
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemDao systemDao;

    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public boolean isUniqueByMcAndBs(System system) {
        List<System> systems = selectAllSystem();
        for (System sys : systems) {
            if(StringUtils.equals(sys.getcBh(),system.getcBh())){
                continue;
            }
            if(StringUtils.isNotBlank(sys.getcBs()) && StringUtils.equals(sys.getcBs(),system.getcBs()) ||
                StringUtils.isNotBlank(sys.getcMc()) && StringUtils.equals(sys.getcMc(),system.getcMc())){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<System> selectAllSystem() {
        return systemDao.selectAllSystem();
    }

    @Override
    public void insertSystemAndAuthority(System system, String userId) {
        system.setcBh(UuidUtil.getUUID32());
        systemDao.insertSystem(system);
        if(StringUtils.isNotBlank(userId)){
            insertAuthority(userId,system.getcBh());
        }
    }

    /**
     * 新增系统时向系统人员权限表插入数据
     * @param userId 人员id
     * @param sysBh 系统ID
     */
    public void insertAuthority(String userId,String sysBh){
        Authority authority = new Authority();
        authority.setcId(UuidUtil.getUUID32());
        authority.setcXtId(sysBh);
        authority.setcRyId(userId);
        authorityDao.insertAuthority(authority);
    }
}