package com.yubin.springbootquickstart.intercept;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: springproject
 * @description: 添加LoginInterceptor拦截器
 * @author: jyb
 * @create: 2019-11-26 14:21
 **/
//@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/v1/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
