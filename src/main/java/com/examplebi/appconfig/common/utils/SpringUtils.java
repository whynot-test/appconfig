package com.examplebi.appconfig.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName SpringUtils
 * @Description spring容器启动时，将应用程序上下文对象传递过来
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:42
 * @Version 1.0
 **/
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        setSpringUtilContext(applicationContext);
    }


    private static void setSpringUtilContext(ApplicationContext applicationContext){
        SpringUtils.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
