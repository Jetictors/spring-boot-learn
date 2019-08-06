package com.jetictors.example.mybatis.controller;

import com.jetictors.example.mybatis.model.User;
import com.jetictors.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  控制类
 * Author         :  Jetictors
 * Time           :  2019/8/6 12:32
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询单个用户对象
     * @PathVariable 为映射，即参数也是url的一部分 访问url的时候为 .../user/1001
     * @param userId  用户id
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUserByIdOne(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    /**
     * 查询单个用户对象
     * @RequestParam 请求参数 访问url的时候为 .../user/once?userId=1001
     * @param userId  用户id
     * @return
     */
    @RequestMapping(value = "/user/once", method = RequestMethod.GET)
    public User getUserByIdTwo(@RequestParam(value = "userId") String userId){
        return userService.getUserById(userId);
    }

    /**
     * 查询全部用户对象
     * @return
     */
    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.getUserList();
    }

}

