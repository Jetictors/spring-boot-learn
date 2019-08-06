package com.jetictors.example.log;

import com.jetictors.example.log.config.log.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
        LogConfig.getInstance().getLogger(LogApplication.class).info("服务器启动成功");
    }

}
