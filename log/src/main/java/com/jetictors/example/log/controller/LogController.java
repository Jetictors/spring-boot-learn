package com.jetictors.example.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class LogController {

    @RequestMapping("/log")
    public String testLog(){
        log.info("Log控制类执行了");
        return "日志已打印 请查看控制台 !";
    }

}
