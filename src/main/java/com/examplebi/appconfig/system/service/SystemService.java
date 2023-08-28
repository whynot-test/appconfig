/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.system.service
 * @className com.examplebi.appconfig.system.service.SystemService
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.system.service;

import java.util.List;

import com.examplebi.appconfig.system.bean.System;

/**
 * SystemService
 * @description 系统相关接口
 * @author Administrator
 * @date 2023/8/26 13:35
 * @version TODO
 */
public interface SystemService {
    /**
     * 判断系统名称和标识是否冲粗
     * @param system
     * @return
     */
    boolean isUniqueByMcAndBs(System system);
    
    List<System> selectAllSystem();

    void insertSystemAndAuthority(System system, String userId);
}