package com.jetictors.example.freemarker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jetictors.example.freemarker.dao")
public class FreeMarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeMarkerApplication.class, args);
    }

}
