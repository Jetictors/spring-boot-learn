package com.jetictors.example.swagger.dao;

import com.jetictors.example.swagger.model.City;

import java.util.List;

/**
 * Desc           :  城市dao类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:37
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public interface CityDao {

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

