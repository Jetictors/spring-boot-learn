package com.jetictors.example.properties.controller;

import com.jetictors.example.properties.property.UserProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc           :  控制类
 * Author         :  Jetictors
 * Time           :  2019/8/8 12:12
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@RestController
@RequestMapping("/test")
public class UserController{

    @Value("${explain}")
    private String explain;

    @Autowired
    private UserProperty userProperty;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World !"
                + "</br>"
                + explain
                + "</br>"
                + userProperty.toString();

    }
}

