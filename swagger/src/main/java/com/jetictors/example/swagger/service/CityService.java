package com.jetictors.example.swagger.service;

import com.jetictors.example.swagger.model.City;

import java.util.List;

/**
 * Desc           :  城市业务类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:34
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface CityService {

    /**
     * 根据城市名称获取城市数据
     * @param cityName  城市名称
     * @return
     */
    City getCityByName(String cityName);

    /**
     * 获取全部城市列表
     * @return
     */
    List<City> getCityList();

    /**
     * 添加城市
     * @return
     */
    int addCity(City city);

    /**
     * 根据城市名称删除城市
     * @param cityName     城市名称
     * @return
     */
    int deleteCityByName(String cityName);

}

