package com.yubin.springbootmybatisbyanotation.service.impl;

import com.yubin.springbootmybatisbyanotation.mapper.UserMapper;
import com.yubin.springbootmybatisbyanotation.pojo.User;
import com.yubin.springbootmybatisbyanotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-27 17:14
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        user.setCreateTime(new Date());
        userMapper.insert(user);
        int id = user.getId();
        return id;
    }

    @Override
    public User findById(Long userId) {
        User user = userMapper.findById(userId);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public void update(User user) {
        User newUser = userMapper.findById(Long.valueOf(user.getId()));
        if (!(null == user.getName())) newUser.setName(user.getName());
        if (!(null == user.getPhone())) newUser.setPhone(user.getPhone());
        if (!(null == user.getCreateTime())) newUser.setCreateTime(new Date());
        if (user.getAge() > 0) newUser.setAge(user.getAge());
        else try {
            throw new Exception("年龄格式不正确，年龄小于0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        userMapper.update(newUser);
    }

    @Override
    public void delete(Long userId) {
        userMapper.delete(userId);
    }

    @Override
    @Transactional(/*propagation = Propagation.REQUIRED*/)
    public int addAccount(User user) {
        user.setCreateTime(new Date());
        userMapper.insert(user);
//        System.out.println(1/0);
        return user.getId();
    }

    @Override
    public int bachAddUser(List<User> list) {
        int flag = 0;
        for (User user : list) {
            user.setCreateTime(new Date());
            flag = userMapper.insert(user);
        }
        return flag;
    }
}
