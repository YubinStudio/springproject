package com.yubin.springtomcat.controller;

import com.yubin.springtomcat.utils.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springproject
 * @description: 4
 * @author: jyb
 * @create: 2019-11-21 10:22
 **/
@RestController
@PropertySource({"classpath:application.properties"})
public class GetConfigurationController {

    @Value("${web.test.value}")
    private String conTest;

    @RequestMapping(path = "/get/config")
    public String getConfiguration() {
        System.out.println("获取配置信息");
        return conTest;
    }

    @Autowired
    private ServerSettings serverSettings;

    @RequestMapping(path = "/get/getserversettings")
    public Object getServerSettings() {
        return serverSettings;
    }

}
