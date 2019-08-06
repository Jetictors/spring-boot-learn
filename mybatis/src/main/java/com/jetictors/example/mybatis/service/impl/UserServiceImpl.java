package com.jetictors.example.mybatis.service.impl;

import com.jetictors.example.mybatis.dao.UserDao;
import com.jetictors.example.mybatis.model.User;
import com.jetictors.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  用户业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/6 12:32
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
}

