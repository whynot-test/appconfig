/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.system.dao.mapper
 * @className com.examplebi.appconfig.system.dao.mapper.AuthorityMapper
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.system.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.examplebi.appconfig.system.bean.Authority;

/**
 * AuthorityMapper
 * @description
 * @author Administrator
 * @date 2023/8/26 13:39
 * @version TODO
 */
@Mapper
public interface AuthorityMapper {
    /**
     * 新增权限系统
     * @param authority
     */
    void insertAuthority(Authority authority);

    /**
     * 删除权限系统
     * @param id 主键
     */
    void deleteAuthority(String id);

    /**
     * 根据人员id
     * 查询权系统 ids
     * @param userId 用户id
     */
    List<String> selectAuthorityByUserId(String userId);

    /**
     * 根据系统id
     * 删除权限系统
     * @param xtId 系统id
     */
    void deleteAuthorityBySystemId(String xtId);


}