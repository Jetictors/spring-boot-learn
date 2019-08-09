package com.jetictors.example.freemarker.dao;

import com.jetictors.example.freemarker.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Desc           :  用户dao类
 * Author         :  Jetictors
 * Time           :  2019/8/7 11:37
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Mapper
public interface UserDao {

    /**
     * 根据用户id获取用户数据
     * @param userId   用户id
     * @return
     */
    User getUserById(String userId);

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
    int deleteUserById(String userId);

    /**
     * 更新用户
     * @return
     */
    int updateUser(User user);

}

