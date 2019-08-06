package com.jetictors.example.mybatisdruid.service;

import com.jetictors.example.mybatisdruid.model.MasterEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  主数据库业务类
 * Author         :  Jetictors
 * Time           :  2019/8/6 16:45
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface MasterService {

    /**
     *根据masterId获取master表的数据
     * @param masterId 主id
     * @return
     */
    MasterEntity getMasterById(@Param("masterId") int masterId);

    /**
     * 获取全部数据
     */
    List<MasterEntity> getMasterList();

}

