package com.jetictors.example.log.controller;

import com.jetictors.example.log.config.log.LogConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        LogConfig.getInstance().getLogger(this.getClass()).info("Hello控制类执行了");
        return "Hello World !";
    }

}
