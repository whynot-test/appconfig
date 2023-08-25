/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.app.dao.mapper
 * @className com.examplebi.appconfig.app.dao.mapper.AppMapper
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.app.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.examplebi.appconfig.app.bean.App;

/**
 * AppMapper
 * @description 子系统Mapper层接口
 * @author Administrator
 * @date 2023/8/24 23:18
 * @version TODO
 */
@Mapper
public interface AppMapper {

    /**
     * 查询系统下应用数量(导入校验使用)
     * @param systemId
     * @return
     */
    Integer selectBySystemId(String systemId);

    /**
     * 根据当登录人id和所在系统ID
     * 查询该用户除当前系统外,其它系统下的子系统
     * @param userId 登陆人id
     * @param systemId 系统id
     * @param dMDB 是否达梦数据库
     * @return
     */
    List<App> selectCanMoveApp(@Param("userId") String userId, @Param("systemId") String systemId, @Param("dMDB") boolean dMDB);

    /**
     * 根据bs获取子系统信息
     * @param bs 子系统主键
     * @return
     */
    App selectAppByBs(String bs);
}