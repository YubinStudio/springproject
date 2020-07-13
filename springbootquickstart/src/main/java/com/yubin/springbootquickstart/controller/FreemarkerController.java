package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.utils.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springproject
 * @description:模板引擎freemarker测试
 * @author: jyb
 * @create: 2019-11-26 17:36
 **/
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {
    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/index")
    public String index() {
        System.out.println("freemarker index page");
        return "fm/user/index";
    }

    @GetMapping("/info")
    public String getInfo(ModelMap modelMap) {
        modelMap.addAttribute("serverSettings", serverSettings);
        System.out.println("---------freemarker----------");
        return "fm/user/info";
    }
}
