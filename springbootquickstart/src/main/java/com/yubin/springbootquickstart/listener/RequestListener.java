package com.yubin.springbootquickstart.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-26 10:28
 **/
//@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("------------requestInitialized 监听器-------------");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("------------requestDestroyed 监听器---------------");
    }
}
