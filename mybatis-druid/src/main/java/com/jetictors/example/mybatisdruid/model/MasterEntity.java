package com.jetictors.example.mybatisdruid.model;

/**
 * Desc           :  主数据库实体类
 * Author         :  Jetictors
 * Time           :  2019/8/6 16:32
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class MasterEntity {

    private int masterId;

    private String name;

    private String des;

    private String time;

    public MasterEntity() { }

    public MasterEntity(int masterId, String name, String des, String time) {
        this.masterId = masterId;
        this.name = name;
        this.des = des;
        this.time = time;
    }

    public int getMasterId() {
        return masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MasterEntity{" +
                "masterId=" + masterId +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}

