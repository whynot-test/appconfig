package com.examplebi.appconfig.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PrivilegeController
 * @Description 后台控制
 * @Author bijunjian
 * @Date 2023/8/28 0028 10:52
 * @Version 1.0
 **/
@Controller
public class PrivilegeController {

    @RequestMapping("/privilege")
    public String privilege(){
        return "login";
    }
}
