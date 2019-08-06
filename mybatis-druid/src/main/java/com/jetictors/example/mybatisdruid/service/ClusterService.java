package com.jetictors.example.mybatisdruid.service;

import com.jetictors.example.mybatisdruid.model.ClusterEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  从数据库业务类
 * Author         :  Jetictors
 * Time           :  2019/8/6 16:46
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface ClusterService {

    /**
     * 根据masterId获取cluster表的数据
     * @param masterId 主id
     * @return
     */
    List<ClusterEntity> getClusterByMasterId(@Param("masterId") int masterId);


    /**
     * 根据clusterId获取cluster表的一条数据
     * @param clusterId 从id
     * @return
     */
    ClusterEntity getClusterByClusterId(@Param("clusterId") int clusterId);

    /**
     * 获取全部数据
     */
    List<ClusterEntity> getClusterList();

}

