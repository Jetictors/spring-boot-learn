package com.jetictors.example.mybatis.controller;

import com.jetictors.example.mybatis.model.City;
import com.jetictors.example.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  城市控制类
 * Author         :  Jetictors
 * Time           :  2019/8/6 15:29
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@RestController
@RequestMapping("/test")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 查询单个城市对象
     * @PathVariable 为映射，即参数也是url的一部分 访问url的时候为 .../city/深圳
     * @param cityName  城市名称
     * @return
     */
    @RequestMapping(value = "/city/{cityName}", method = RequestMethod.GET)
    public City getCityByNameOne(@PathVariable String cityName){
        return cityService.getCityByName(cityName);
    }

    /**
     * 查询单个城市对象
     * @RequestParam 请求参数 访问url的时候为 .../user/once?city=深圳
     * @param cityName  城市名称
     * @return
     */
    @RequestMapping(value = "/city/once", method = RequestMethod.GET)
    public City getCityByNameTwo(@RequestParam(value = "cityName") String cityName){
        return cityService.getCityByName(cityName);
    }

    /**
     * 查询全部城市对象
     * @return
     */
    @RequestMapping(value = "/city/all", method = RequestMethod.GET)
    public List<City> getCityList(){
        return cityService.getCityList();
    }

}

