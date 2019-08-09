package com.jetictors.example.freemarker.service.impl;

import com.jetictors.example.freemarker.dao.UserDao;
import com.jetictors.example.freemarker.model.User;
import com.jetictors.example.freemarker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  用户业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/7 11:39
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
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
    public int deleteUserById(String userId) {
        return userDao.deleteUserById(userId);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

}

