package com.yubin.springbootquickstart.filter;

import lombok.var;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springproject
 * @description: 简单使用过滤器
 * @author: jyb
 * @create: 2019-11-25 14:48
 **/
@WebFilter(urlPatterns = "/api/v1/*")
public class UrlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UrlFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        var resp = (HttpServletResponse) response;
        String userId = req.getParameter("user_id");
        if (!("9527".equals(userId))) {
            chain.doFilter(request, response);
        } else {
            System.out.println("-------------- is xianyu 9527 ---------------");
            resp.sendRedirect("/error.html");
        }
    }

    @Override
    public void destroy() {
        System.out.println("UrlFilter has destroy");
    }
}
