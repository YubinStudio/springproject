package com.yubin.springbootmybatisbyanotation.controller;

import com.yubin.springbootmybatisbyanotation.pojo.JsonData;
import com.yubin.springbootmybatisbyanotation.pojo.User;
import com.yubin.springbootmybatisbyanotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-27 16:35
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/v1/add")
    public JsonData addUser(@RequestBody User user) {
        /*User user = new User();
        user.setName("yu");
        user.setPhone("1008611");
        user.setCreateTime(new Date());
        user.setAge(23);*/
        int user_id = userService.add(user);

        JsonData jsonData = new JsonData("2019", "添加成功", user_id);
        return jsonData;
    }

    @PostMapping(path = "/v1/bach_add")
    public JsonData bachAddUser(@RequestBody List<User> list) {
        int bachAddUser = userService.bachAddUser(list);
        return new JsonData("2019,", "批量添加成功", bachAddUser);
    }

    @GetMapping(path = "/v1/get/{id}")
    public JsonData findById(@PathVariable("id") Long userId) {
        User oneUser = userService.findById(userId);
        JsonData jsonData = new JsonData("2019", "查询成功", oneUser);
        return jsonData;
    }

    @GetMapping(path = "/v1/get_all_user")
    public JsonData findAllUser() {
        List<User> allUser = userService.findAllUser();
        JsonData jsonData = new JsonData("2019", "查询成功", allUser);
        return jsonData;
    }

    @DeleteMapping(path = "/v1/delete/{id}")
    public JsonData deleteUser(@PathVariable("id") Long userId) {
        userService.delete(userId);
        return new JsonData("200", "删除成功！", "");
    }

    @PutMapping(path = "/v1/update")
    public JsonData updateUser(@RequestBody User user) {
//        int webId = user.getId();
//        User searchUser = userService.findById(Long.valueOf(webId));
//
        userService.update(user);
        return new JsonData("200", "修改成功！", "");
    }

    @PostMapping(path = "/v1/add_account")
    public JsonData addAccount(@RequestBody User user) {
        return new JsonData("200", "事务添加成功！", userService.addAccount(user));
    }

}
