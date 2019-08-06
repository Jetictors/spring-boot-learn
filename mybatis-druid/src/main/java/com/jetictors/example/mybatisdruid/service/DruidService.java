package com.jetictors.example.mybatisdruid.service;

import com.jetictors.example.mybatisdruid.model.DruidEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  连接两个数据路查询的业务类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:02
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface DruidService {

    /**
     * 根据masterId获取连接的一条数据
     * @param masterId
     * @return
     */
    DruidEntity getDruidById(@Param("masterId") int masterId);


    /**
     * 获取全部数据
     */
    List<DruidEntity> getDruidList();


}

