package com.yubin.springbootredis.controller;

import com.yubin.springbootredis.pojo.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-12-10 09:32
 **/
@RestController
@RequestMapping("api/v1/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    //String 值类型操作：
    @RequestMapping(path = "set", method = RequestMethod.GET)
    public JsonData setValue() {
        redisTemplate.opsForValue().set("name", "wuyaowang");
        return new JsonData("200", "添加成功", "");
    }

    @GetMapping("get")
    public JsonData getValue() {
        Object name = redisTemplate.opsForValue().get("name");
        return new JsonData("200", "查询成功", name);
    }

    @GetMapping("del")
    public JsonData delValue() {
        Boolean delete = redisTemplate.delete("name");
        return new JsonData("200", "删除成功", delete);
    }

    //
}
