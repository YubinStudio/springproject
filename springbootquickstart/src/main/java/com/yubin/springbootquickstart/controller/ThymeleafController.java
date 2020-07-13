package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.utils.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-27 14:42
 **/
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/index")
    public String thymeleafTest() {
        System.out.println("---------thymeleafTest----------");
        return "index";
    }

    @GetMapping("/info")
    public String getInfo(ModelMap modelMap) {
        modelMap.addAttribute("serverSettings", serverSettings);
        System.out.println("---------thymeleafTest----------");
        return "user/info";
    }
}
