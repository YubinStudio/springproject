package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.utils.ServerSettings;
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
@RequestMapping("config")
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

    @RequestMapping(path = "/get/getServerSettings")
    public Object getServerSettings() {
        return serverSettings;
    }

}
