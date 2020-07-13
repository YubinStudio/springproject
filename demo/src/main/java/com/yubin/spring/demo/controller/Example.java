package com.yubin.spring.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springproject
 * @description: springboot快速入门
 * @author: jyb
 * @create: 2019-11-17 22:27
 **/
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World123!";
    }

}