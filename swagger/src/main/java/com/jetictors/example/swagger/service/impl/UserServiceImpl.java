package com.jetictors.example.swagger.service.impl;

import com.jetictors.example.swagger.dao.UserDao;
import com.jetictors.example.swagger.model.User;
import com.jetictors.example.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  用户业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:35
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(long userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(long userId) {
        return userDao.deleteUserById(userId);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}

