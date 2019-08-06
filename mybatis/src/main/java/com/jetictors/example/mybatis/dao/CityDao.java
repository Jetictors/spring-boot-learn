package com.jetictors.example.mybatis.dao;

import com.jetictors.example.mybatis.model.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Desc           :  城市dao类
 * Author         :  Jetictors
 * Time           :  2019/8/6 15:21
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Mapper
public interface CityDao {

    /**
     * 根据城市名称获取城市数据
     * @param cityName  城市名称
     * @return
     */
    @Select("select * from city where cityName='${cityName}'")
    @Results({
            @Result(property = "cityId", column = "cityId"),
            @Result(property = "provinceId", column = "provinceId"),
            @Result(property = "cityName", column = "cityName"),
            @Result(property = "description", column = "description")
    })
    City getCityByName(@Param("cityName") String cityName);

    /**
     * 获取城市列表
     * @return
     */
    @Select("select * from city")
    @Results({
            @Result(property = "cityId", column = "cityId"),
            @Result(property = "provinceId", column = "provinceId"),
            @Result(property = "cityName", column = "cityName"),
            @Result(property = "description", column = "description")
    })
    List<City> getCityList();

}

