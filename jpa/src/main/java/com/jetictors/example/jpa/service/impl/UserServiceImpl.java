package com.jetictors.example.jpa.service.impl;

import com.jetictors.example.jpa.dao.UserDao;
import com.jetictors.example.jpa.model.User;
import com.jetictors.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Desc           :  用户业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/13 15:34
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllList() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(String userId) {
        Optional<User> optional = userDao.findById(userId);
        return optional.orElse(null);
    }

    @Override
    public User getUserByName(String userName) {
       return userDao.getUserByName(userName);
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User deleteUser(String userId) {
        Optional<User> optional = userDao.findById(userId);
        userDao.delete(optional.get());
        return optional.orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }
}

