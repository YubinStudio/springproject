package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.pojo.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springproject
 * @description: get请求
 * @author: jyb
 * @create: 2019-11-19 09:25
 **/
@RestController
@RequestMapping("api")
public class requestController {
    private Map<String, Object> params = new HashMap<>();

    /**
     * RequestParam 给请求参数添加 默认值 是否必须
     */
    @RequestMapping(path = "/v1/RequestParamTest", method = RequestMethod.GET)
    public Map<String, Object> getParams(@RequestParam(name = "user_id", defaultValue = "007", required = true) String id, int page) {
        params.clear();
        params.put("id", id);
        params.put("page", page);
        return params;
    }

    /**
     *
     */
    @RequestMapping(path = "/v1/{user_id}/{user_name}", method = RequestMethod.GET)
    public Object findUser(@PathVariable("user_id") String id,
                           @PathVariable("user_name") String name) {
        params.clear();
        params.put("id", id);
        params.put("name", name);
        return params;
    }

    /**
     * 前端推荐使用post请求方式
     *
     * @param person
     * @return
     */
    @RequestMapping("/v1/body")
    public Object getByRequestBody(@RequestBody Person person) {
        params.clear();
        params.put("method", "post");
        params.put("person", person);
        return params;
    }

    @RequestMapping("/v1/BodyURequestParam")
    public Object myRequestBodyAndRequestParam(@RequestBody Person person, @RequestParam(value = "flag", required = false) String flag, HttpServletRequest request) {
        params.clear();
        params.put("method", request.getMethod());
        params.put("flags", flag);
        params.put("personInfo", person);
        return params;
    }

    @RequestMapping(path = "/v1/jackSonResult")
    public Object jackSonResult() {
        params.clear();
        System.out.println("controller-jackSonResult");
        Person person = new Person("007", "zxx", "55", "9527", new Date());
        params.put("jackSonResult-person", person);

        return params;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
