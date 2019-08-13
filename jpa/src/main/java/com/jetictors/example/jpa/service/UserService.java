package com.jetictors.example.jpa.service;

import com.jetictors.example.jpa.model.User;

import java.util.List;

/**
 * Desc           :  用户业务类
 * Author         :  Jetictors
 * Time           :  2019/8/13 15:34
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface UserService {

    /**
     * 获取用户列表
     * @return
     */
    List<User> getAllList();

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return
     */
    User getUserById(String userId);

    /**
     * 根据用户名获取用户信息
     * @param userName 用户名
     * @return
     */
    User getUserByName(String userName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 根据用户id删除用户
     * @param userId 用户id
     * @return
     */
    User deleteUser(String userId);

    /**
     * 更新
     * @param user
     * @return
     */
    User updateUser(User user);

}

