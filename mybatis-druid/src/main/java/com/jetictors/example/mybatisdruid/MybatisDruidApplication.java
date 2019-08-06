package com.jetictors.example.mybatisdruid;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.jetictors.example.mybatisdruid.dao")
public class MybatisDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDruidApplication.class, args);
        log.info("服务器启动成功");
    }

}
