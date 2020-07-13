package com.yubin.springbootquickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springproject
 * @description: 请求参数类型 form-data,raw
 * @author: jyb
 * @create: 2019-12-09 09:48
 **/
@Controller
@RequestMapping("param")
public class ParamController {

    private Map<String, Object> param = new HashMap<>();

    /**
     * @RequestParam： ① 用来处理（前端）Content-Type: 为 application/x-www-form-urlencoded或者form-data编码的内容
     * ② 该注解有两个属性： value、required； value用来指定要传入值的id名称，required用来指示参数是否必须绑定；
     * 注意这里Headers里不能以application/json作为Content-type，否则后台也接收不到请求
     */
    @PostMapping("/v1/form_data")
    @ResponseBody
    public Object getFormData(@RequestParam String id,
                              @RequestParam String name,
                              @RequestParam String age) {

        param.clear();
        param.put("code", 200);
        param.put("userId", id);
        param.put("name", name);
        param.put("age", age);
        System.out.println("getFormData Test");
        return param;
    }

    @RequestMapping(path = "/v1/raw", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getRaw(@RequestBody Map<String, Object> map) {
        param.clear();
        param.put("user_id", map.get("id"));
        param.put("account", map.get("account"));

        return param;
    }
}
