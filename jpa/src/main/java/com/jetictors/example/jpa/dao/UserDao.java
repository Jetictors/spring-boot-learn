package com.jetictors.example.jpa.dao;

import com.jetictors.example.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Desc           :  用户dao类
 * Author         :  Jetictors
 * Time           :  2019/8/13 15:29
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {

    /**
     * 根据用户名获取用户对象
     * @param userName
     * @return
     */
    @Query(nativeQuery = true, value = "select * from tb_user where user_name= :user_name")
    User getUserByName(@Param("user_name") String userName);

}

