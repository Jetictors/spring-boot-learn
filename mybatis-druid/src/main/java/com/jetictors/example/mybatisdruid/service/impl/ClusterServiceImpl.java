package com.jetictors.example.mybatisdruid.service.impl;

import com.jetictors.example.mybatisdruid.dao.cluster.ClusterDao;
import com.jetictors.example.mybatisdruid.model.ClusterEntity;
import com.jetictors.example.mybatisdruid.service.ClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:19
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@Service
public class ClusterServiceImpl implements ClusterService {

    @Autowired
    private ClusterDao clusterDao;

    @Override
    public List<ClusterEntity> getClusterByMasterId(int masterId) {
        return clusterDao.getClusterByMasterId(masterId);
    }

    @Override
    public ClusterEntity getClusterByClusterId(int clusterId) {
        return clusterDao.getClusterByClusterId(clusterId);
    }

    @Override
    public List<ClusterEntity> getClusterList() {
        return clusterDao.getClusterList();
    }
}

