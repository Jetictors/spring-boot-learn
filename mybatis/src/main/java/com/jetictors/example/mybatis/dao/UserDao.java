package com.jetictors.example.mybatis.dao;

import com.jetictors.example.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  用户dao类
 * Author         :  Jetictors
 * Time           :  2019/8/6 14:15
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Mapper
public interface UserDao {

    /**
     * 根据id获取用户
     * 其中@Param注解中的参数是数据库表中对应的字段
     * @param userId 用户id
     * @return
     */
    User getUserById(@Param("userId") String userId);

    /**
     * 获取全部用户
     * @return
     */
    List<User> getUserList();

}

