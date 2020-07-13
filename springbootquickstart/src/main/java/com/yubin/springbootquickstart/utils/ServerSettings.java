package com.yubin.springbootquickstart.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: springproject
 * @description:配置类
 * @author: jyb
 * @create: 2019-11-21 10:59
 **/
@Component
@ConfigurationProperties(prefix = "web.test")
@PropertySource({"classpath:application.properties"})
public class ServerSettings {

//    @Value("${web.test.domain}")
    private String domain;
//    @Value("${web.test.name}")
    private String name;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
