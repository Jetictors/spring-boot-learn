package com.jetictors.example.freemarker.controller;

import com.jetictors.example.freemarker.model.BaseModel;
import com.jetictors.example.freemarker.model.User;
import com.jetictors.example.freemarker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  用户控制类
 * Author         :  Jetictors
 * Time           :  2019/8/7 11:36
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/api/user/{userId}", method = RequestMethod.GET)
    public BaseModel<User> getUserById(@PathVariable String userId){
        User user = userService.getUserById(userId);

        return getBaseModel(1001, "success", true, user);
    }

    @ResponseBody
    @RequestMapping(value = "/api/user/all", method = RequestMethod.GET)
    public BaseModel<List<User>> getUserList(){
        List<User> userList = userService.getUserList();
        return getBaseModel(1001, "success", true, userList);
    }

    @ResponseBody
    @RequestMapping(value = "/api/user/delete", method = RequestMethod.GET)
    public BaseModel deleteUserById(@RequestParam("userId") String userId){
        int result = userService.deleteUserById(userId);

        if (result > 0){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }

    }

    @ResponseBody
    @RequestMapping(value = "/api/user/update", method = RequestMethod.POST)
    public BaseModel updateUser(User user){
        int result = userService.updateUser(user);

        if (result > 0){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/api/user/add", method = RequestMethod.POST)
    public BaseModel addUser(User user){
        int result = userService.addUser(user);

        if (result > 0){
            return getBaseModel(1001, "success", true, null);
        }else {
            return getBaseModel(1002, "failed", false, null);
        }
    }

    @RequestMapping("/page/index")
    public String toPageIndex(){
        return "index";
    }

    @RequestMapping(value = "/page/user/{userId}", method = RequestMethod.GET)
    public String toPageUser(Model model, @PathVariable("userId") String userId){
        model.addAttribute("user",userService.getUserById(userId));
        return "userInfo";
    }

    @RequestMapping("/page/userList")
    public String toPageUserList(Model model){
        model.addAttribute("userList",userService.getUserList());
        return "userList";
    }

    private <T> BaseModel<T> getBaseModel(int code, String msg, boolean status , T data){
        return new BaseModel<>(code, msg, status, data);
    }

}

