package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.pojo.Person;
import com.yubin.springbootquickstart.utils.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: springproject
 * @description: 异常类controller
 * @author: jyb
 * @create: 2019-11-21 17:47
 **/
@RestController
public class ExceptionController {

    @RequestMapping(path = "/ex/exception")
    public Object testException() {
//        System.out.println(1/0);
//        String str = null;
//        System.out.println(str.length());
        System.out.println("testException");
        return new Person("0001", "yu", "23", "10086", new Date());
    }

    @RequestMapping(path = "/ex/myxception")
    public Object myException() {
//        System.out.println(1/0);
        System.out.println("myException");
        throw new MyException("500", "MyException");
    }
}
