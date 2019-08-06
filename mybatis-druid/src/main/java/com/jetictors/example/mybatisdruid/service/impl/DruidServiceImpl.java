package com.jetictors.example.mybatisdruid.service.impl;

import com.jetictors.example.mybatisdruid.dao.cluster.ClusterDao;
import com.jetictors.example.mybatisdruid.dao.master.MasterDao;
import com.jetictors.example.mybatisdruid.model.ClusterEntity;
import com.jetictors.example.mybatisdruid.model.DruidEntity;
import com.jetictors.example.mybatisdruid.model.MasterEntity;
import com.jetictors.example.mybatisdruid.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc           :  业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:08
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@Service
public class DruidServiceImpl implements DruidService {

    @Autowired
    private MasterDao masterDao;

    @Autowired
    private ClusterDao clusterDao;

    @Override
    public DruidEntity getDruidById(int masterId) {
        MasterEntity master = masterDao.getMasterById(masterId);
        List<ClusterEntity> clusterList = clusterDao.getClusterByMasterId(masterId);

        DruidEntity entity = new DruidEntity(master, clusterList);
        return entity;
    }

    @Override
    public List<DruidEntity> getDruidList() {

        List<DruidEntity> druidList = new ArrayList<>();

        List<MasterEntity> masterList = masterDao.getMasterList();
        for (MasterEntity master : masterList){
            List<ClusterEntity> clusterList = clusterDao.getClusterByMasterId(master.getMasterId());

            druidList.add(new DruidEntity(master, clusterList));
        }

        return druidList;
    }
}

