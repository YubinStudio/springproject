package com.yubin.springbootquickstart.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-26 14:23
 **/
public class LoginInterceptor implements HandlerInterceptor {

    //TODO 进入controller方法之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor--------->preHandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    //TODO 调用controller但是未渲染视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor--------->postHandle");
    }

    //完成拦截过程，通常用做资源清理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginInterceptor--------->afterCompletion------>资源清理");
    }
}
