package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.pojo.Person;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springproject
 * @description: post put delete 方式
 * @author: jyb
 * @create: 2019-11-19 11:14
 **/
@RestController
@RequestMapping("api")
public class otherController {

    Map<String, Object> params = new HashMap<>();

    /**
     * post方式
     */
//    @PostMapping
    @RequestMapping(path = "/v2/post", method = RequestMethod.POST)
    public Object postMethod(@RequestBody(required = false) Person person) {
        params.clear();
        params.put("post-person", person);
        return params;
    }

    /**
     * put方式
     */
//    @PutMapping
    @RequestMapping(path = "/v2/put", method = RequestMethod.PUT)
    public Object putMethod(@RequestParam("array") List<String> array) {
        params.clear();
        int i = 0;
        for (String s : array) {
            params.put("params"+i, s);
            i++;
        }
        return params;
    }

    /**
     * delete方式
     */
    @DeleteMapping(path = "/v2/delete/{user_id}")
    public Object deleteMethod(@PathVariable("user_id") String userId) {
        params.clear();
        params.put("userId", userId);
        params.put("flags", Boolean.TRUE);
        params.put("msg", "根据id删除用户");
        return params;
    }
}
