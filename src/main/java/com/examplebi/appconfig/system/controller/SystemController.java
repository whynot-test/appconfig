package com.examplebi.appconfig.system.controller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examplebi.appconfig.common.bean.AppconfigResponse;
import com.examplebi.appconfig.common.consts.CommonConst;
import com.examplebi.appconfig.common.enums.ResponseCode;
import com.examplebi.appconfig.common.utils.CheckUtils;
import com.examplebi.appconfig.common.utils.ResponseUtil;
import com.examplebi.appconfig.system.bean.System;
import com.examplebi.appconfig.system.service.SystemService;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 15:52:22
 * @version: V1
 * @Description: 系统信息controller
 */
@RequestMapping("/api")
@RestController
public class SystemController {

    private static Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private SystemService systemService;

    @PostMapping(path = "/v3/system",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String insertSystem(@RequestBody System system, @RequestParam String userId){
        if(checkSystemParam(system)){
            return ResponseUtil.toString(new AppconfigResponse(ResponseCode.RESPONSE_422_PARAM_ERROR));
        }
        if(systemService.isUniqueByMcAndBs(system)){
            return ResponseUtil.toString(new AppconfigResponse(ResponseCode.RESPONSE_409_DATA_COLLISION));
        }
        systemService.insertSystemAndAuthority(system, userId);
        return "";
    }

    private boolean checkSystemParam(System system){
        return !(StringUtils.isNotBlank(system.getcBs()) && StringUtils.isNotBlank(system.getcMc())
                && CheckUtils.checkLength(system.getcBs(), CommonConst.SYSTEM_BS_MC_LENGTH_MAX)
                && CheckUtils.checkLength(system.getcMc(), CommonConst.SYSTEM_BS_MC_LENGTH_MAX));
    }


}