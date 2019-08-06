package com.jetictors.example.log.config.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desc           :  logger配置类
 * Author         :  Jetictors
 * Time           :  2019/8/6 11:49
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class LogConfig {

    private static LogConfig sInstance;

    public static LogConfig getInstance(){
        if (null == sInstance){
            synchronized (LogConfig.class){
                if (null == sInstance){
                    sInstance = new LogConfig();
                }
            }
        }
        return sInstance;
    }

    public Logger getLogger(String name){
        return LoggerFactory.getLogger(name);
    }

    public Logger getLogger(Class<?> clazz){
        return LoggerFactory.getLogger(clazz);
    }

}

