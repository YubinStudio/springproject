package com.yubin.springbootmybatisbyanotation.service;

import com.yubin.springbootmybatisbyanotation.pojo.User;

import java.util.List;

public interface UserService {

    int add(User user);

    User findById(Long userId);

    List<User> findAllUser();

    void update(User user);

    void delete(Long userId);

    int addAccount(User user);

    int bachAddUser(List<User> list);

}
