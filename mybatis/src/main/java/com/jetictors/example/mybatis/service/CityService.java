package com.jetictors.example.mybatis.service;

import com.jetictors.example.mybatis.model.City;

import java.util.List;

/**
 * Desc           :  城市业务类
 * Author         :  Jetictors
 * Time           :  2019/8/6 15:20
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface CityService {

    /**
     * 根据城市名称获取城市数据
     * @param cityName 城市名称
     * @return
     */
    City getCityByName(String cityName);

    /**
     * 获取城市列表数据
     * @return
     */
    List<City> getCityList();

}

