package com.jetictors.example.swagger.controller;

import com.jetictors.example.swagger.model.ResultBean;
import com.jetictors.example.swagger.model.User;
import com.jetictors.example.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  用户控制类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:38
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@Api(description = "用户相关操作接口", tags = "user")
@RestController
@RequestMapping("/test")
public class UserController{

    @Autowired
    private UserService userService;

    @ApiOperation(value = "getUserById", notes = "根据用户id获取用户数据")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "userId", value = "用户id")
    )
    @GetMapping("/user/{userId}")
    public ResultBean<User> getUserById(@PathVariable long userId){
        return new ResultBean<User>(userService.getUserById(userId));
    }


    @ApiOperation(value = "getUserList", notes = "获取用户列表")
    @GetMapping("/user/all")
    public ResultBean<List<User>> getUserList(){
        return new ResultBean<List<User>>(userService.getUserList());
    }


    @ApiOperation(value = "deleteUserById", notes = "根据用户id删除用户数据")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "userId", value = "用户id")
    )
    @DeleteMapping(value = "/user/delete/{userId}")
    public ResultBean deleteUserById(@PathVariable long userId){
        userService.deleteUserById(userId);
        return new ResultBean();
    }


    @ApiOperation(value = "updateUser", notes = "更新用户数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id"),
            @ApiImplicitParam(name = "userName", value = "用户名"),
            @ApiImplicitParam(name = "pwd", value = "用户密码"),
            @ApiImplicitParam(name = "nickName", value = "昵称"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "sex", value = "性别")
    })
    @PostMapping(value = "/user/update")
    public ResultBean updateUser(User user){
        userService.updateUser(user);
        return new ResultBean();
    }

    @ApiOperation(value = "addUser", notes = "添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id"),
            @ApiImplicitParam(name = "userName", value = "用户名"),
            @ApiImplicitParam(name = "pwd", value = "用户密码"),
            @ApiImplicitParam(name = "nickName", value = "昵称"),
            @ApiImplicitParam(name = "age", value = "年龄"),
            @ApiImplicitParam(name = "sex", value = "性别")
    })
    @PostMapping(value = "/user/add")
    public ResultBean addUser(User user){
        userService.addUser(user);
        return new ResultBean();
    }

}

