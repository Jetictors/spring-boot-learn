package com.jetictors.example.swagger.dao;

import com.jetictors.example.swagger.model.User;

import java.util.List;

/**
 * Desc           :  用户dao类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:37
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface UserDao {

    /**
     * 根据用户id获取用户数据
     * @param userId   用户id
     * @return
     */
    User getUserById(long userId);

    /**
     * 获取全部用户列表
     * @return
     */
    List<User> getUserList();

    /**
     * 添加用户
     * @return
     */
    int addUser(User user);

    /**
     * 根据用户id删除用户
     * @param userId     用户id
     * @return
     */
    int deleteUserById(long userId);

    /**
     * 更新用户
     * @return
     */
    int updateUser(User user);

}

