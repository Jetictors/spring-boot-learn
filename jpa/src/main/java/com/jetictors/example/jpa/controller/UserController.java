package com.jetictors.example.jpa.controller;

import com.jetictors.example.jpa.model.BaseModel;
import com.jetictors.example.jpa.model.User;
import com.jetictors.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  用户控制类
 * Author         :  Jetictors
 * Time           :  2019/8/13 15:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public BaseModel<User> getUserByName(@RequestParam("userName") String userName){
        User user = userService.getUserByName(userName);
        return getBaseModel(1001, "success", true, user);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public BaseModel<User> getUserById(@PathVariable String userId){
        User user = userService.getUserById(userId);
        return getBaseModel(1001, "success", true, user);
    }

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public BaseModel<List<User>> getAllList(){
        List<User> userList = userService.getAllList();
        return getBaseModel(1001, "success", true, userList);
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public BaseModel deleteUserById(@RequestParam("userId") String userId){
        User result = userService.deleteUser(userId);
        if (result != null){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public BaseModel updateUser(User user){
        User result = userService.updateUser(user);
        if (result != null){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public BaseModel addUser(User user){
        User result = userService.addUser(user);
        if (result != null){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }
    }

    private <T> BaseModel<T> getBaseModel(int code, String msg, boolean status , T data){
        return new BaseModel<>(code, msg, status, data);
    }

}

