package com.jetictors.example.mybatisdruid.config;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

public class CommonConfig{

    DataSource getDataSource(String url, String driverClass, String user, String pwd){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pwd);
        return dataSource;
    }

}
