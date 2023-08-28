package com.examplebi.appconfig.system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examplebi.appconfig.system.bean.Authority;
import com.examplebi.appconfig.system.dao.mapper.AuthorityMapper;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 13:36:54
 * @version: v1
 * @Description: 系统认证DAO
 */
@Repository
public class AuthorityDao {

    @Autowired
    private AuthorityMapper authorityMapper;

    public void insertAuthority(Authority authority){
        authorityMapper.insertAuthority(authority);
    }

    public void deleteAuthority(String id){
        authorityMapper.deleteAuthority(id);
    }

    public void deleteAuthorityBySystemId(String systemId){
        authorityMapper.deleteAuthority(systemId);
    }

    public List<String> selectSystemIdByUserId(String userId){
        return authorityMapper.selectAuthorityByUserId(userId);
    }
}