package com.yubin.springbootquickstart.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springproject
 * @description: 通过 javaConfig方式配置 SpringBoot 过滤链类 FilterRegistrationBean
 * @author: jyb
 * @create: 2019-11-25 15:47
 **/
//@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new UrlFilter());
        List<String> list = new ArrayList<>();
        list.add("/api/v1/*");
        registrationBean.setUrlPatterns(list);
        registrationBean.setName("UrlFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
