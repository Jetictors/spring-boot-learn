package com.jetictors.example.swagger.controller;

import com.jetictors.example.swagger.model.City;
import com.jetictors.example.swagger.model.ResultBean;
import com.jetictors.example.swagger.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  城市控制类
 * Author         :  Jetictors
 * Time           :  2019/8/14 14:44
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Api(description = "城市相关操作接口", tags = "city")
@RequestMapping("/test")
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @ApiOperation(value = "getCityByName", notes = "根据城市名称获取城市数据")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "cityName", value = "城市名称")
    )
    @GetMapping("/city/{cityName}")
    public ResultBean<City> getCityByName(@PathVariable String cityName){
        return new ResultBean<City>(cityService.getCityByName(cityName));
    }


    @ApiOperation(value = "getCityList", notes = "获取城市列表")
    @GetMapping("/city/all")
    public ResultBean<List<City>> getCityList(){
        return new ResultBean<List<City>>(cityService.getCityList());
    }


    @ApiOperation(value = "deleteCityByName", notes = "根据城市名称删除城市数据")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "cityName", value = "城市名称")
    )
    @DeleteMapping(value = "/city/delete/{cityName}")
    public ResultBean deleteCityByName(@PathVariable String cityName){
        cityService.deleteCityByName(cityName);
        return new ResultBean();
    }

    @ApiOperation(value = "addCity", notes = "添加城市")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cityId", value = "城市id"),
            @ApiImplicitParam(name = "provinceId", value = "次级id"),
            @ApiImplicitParam(name = "cityName", value = "城市名称"),
            @ApiImplicitParam(name = "description", value = "说明"),
    })
    @PostMapping(value = "/city/add")
    public ResultBean addCity(City city){
        cityService.addCity(city);
        return new ResultBean();
    }

}

