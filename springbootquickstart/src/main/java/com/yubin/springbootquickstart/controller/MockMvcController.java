package com.yubin.springbootquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-21 16:18
 **/
@RestController
public class MockMvcController {

    @RequestMapping(path = "/test/MockMvcController")
    public String test() {
        return "MockMvcController-success";
    }

}
