package com.jetictors.example.mybatisdruid.dao.cluster;

import com.jetictors.example.mybatisdruid.model.ClusterEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc           :  从数据库dao类
 * Author         :  Jetictors
 * Time           :  2019/8/6 16:30
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface ClusterDao {

    /**
     * 根据clusterId获取从数据库中表cluster得一条数据
     * @param clusterId  从id
     * @return
     */
    ClusterEntity getClusterByClusterId(@Param("clusterId") int clusterId);

    /**
     * 根据masterId获取从数据库中表cluster数据
     * @param masterId  主id
     * @return
     */
    List<ClusterEntity> getClusterByMasterId(@Param("masterId") int masterId);

    /**
     * 获取从数据库中表cluster数据
     * @return
     */
    List<ClusterEntity> getClusterList();

}

