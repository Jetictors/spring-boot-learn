package com.jetictors.example.mybatisdruid.model;

import java.util.List;

/**
 * Desc           :  连接查询的实体类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:03
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class DruidEntity {

    private MasterEntity master;

    private List<ClusterEntity> list;

    public DruidEntity(MasterEntity master, List<ClusterEntity> list) {
        this.master = master;
        this.list = list;
    }

    public MasterEntity getMaster() {
        return master;
    }

    public void setMaster(MasterEntity master) {
        this.master = master;
    }

    public List<ClusterEntity> getList() {
        return list;
    }

    public void setList(List<ClusterEntity> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DruidEntity{" +
                "master=" + master +
                ", list=" + list +
                '}';
    }
}

