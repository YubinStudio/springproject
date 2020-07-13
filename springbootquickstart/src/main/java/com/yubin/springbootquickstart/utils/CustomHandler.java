package com.yubin.springbootquickstart.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springproject
 * @description:自定义简单异常类
 * @author: jyb
 * @create: 2019-11-21 17:41
 **/
@RestControllerAdvice
public class CustomHandler {

    private static final Logger log = LoggerFactory.getLogger(CustomHandler.class);

//    捕获全局异常
    @ExceptionHandler(value = Exception.class)
    Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 500);
        result.put("msg", ex.getMessage()+" , "+ex.getCause());
        result.put("status", request.getRequestURI());
        return result;
    }

    /**
     * 处理自定义异常类
     * @param
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    public Object handleMyException(MyException ex,HttpServletRequest request) {
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg", e.getMessage());
        return modelAndView;*/

        Map<String, Object> result = new HashMap<>();
        result.put("code", ex.getCode());
        result.put("msg", ex.getMessage());
        result.put("status", request.getRequestURI());
        return result;

    }

}
