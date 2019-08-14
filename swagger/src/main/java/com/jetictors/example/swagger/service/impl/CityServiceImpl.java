package com.jetictors.example.swagger.service.impl;

import com.jetictors.example.swagger.dao.CityDao;
import com.jetictors.example.swagger.model.City;
import com.jetictors.example.swagger.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  城市业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:35
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City getCityByName(String cityName) {
        return cityDao.getCityByName(cityName);
    }

    @Override
    public List<City> getCityList() {
        return cityDao.getCityList();
    }

    @Override
    public int addCity(City city) {
        return cityDao.addCity(city);
    }

    @Override
    public int deleteCityByName(String cityName) {
        return cityDao.deleteCityByName(cityName);
    }
}

