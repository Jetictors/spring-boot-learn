package com.jetictors.example.mybatisdruid.dao.master;

import com.jetictors.example.mybatisdruid.model.MasterEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  主数据库dao类
 * Author         :  Jetictors
 * Time           :  2019/8/6 16:30
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface MasterDao {

    /**
     * 根据id获取主数据库中表master得一条数据
     * @param masterId  id
     * @return
     */
    MasterEntity getMasterById(@Param("masterId") int masterId);

    /**
     * 获取从数据库中表cluster数据
     * @return
     */
    List<MasterEntity> getMasterList();

}

