package com.yubin.springbootquickstart.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-26 10:38
 **/
//@WebListener
public class CustomContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("|||||||||||||contextInitialized-监听器||||||||||||||||");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("|||||||||||||contextDestroyed-监听器||||||||||||||||");
    }
}
