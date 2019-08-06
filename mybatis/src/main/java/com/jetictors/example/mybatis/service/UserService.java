package com.jetictors.example.mybatis.service;

import com.jetictors.example.mybatis.model.User;

import java.util.List;

/**
 * Desc           :  用户业务类
 * Author         :  Jetictors
 * Time           :  2019/8/6 12:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface UserService {

    /**
     * 根据id获取对象
     * @param userId  用户id
     * @return
     */
    User getUserById(String userId);

    /**
     * 获取全部用户对象
     * @return
     */
    List<User> getUserList();

}

