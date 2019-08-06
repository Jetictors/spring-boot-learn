package com.jetictors.example.mybatisdruid.controller;

import com.jetictors.example.mybatisdruid.model.DruidEntity;
import com.jetictors.example.mybatisdruid.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  Druid控制类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:25
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@RestController
@RequestMapping("/test")
public class DruidController {

    @Autowired
    private DruidService druidService;

    @RequestMapping(value = "/druid/{masterId}", method = RequestMethod.GET)
    public DruidEntity getDruidByIdOne(@PathVariable int masterId){
        return druidService.getDruidById(masterId);
    }


    @RequestMapping(value = "/druid/once", method = RequestMethod.GET)
    public DruidEntity getDruidByIdTwo(@RequestParam("masterId") int masterId){
        return druidService.getDruidById(masterId);
    }

    @RequestMapping(value = "/druid/all", method = RequestMethod.GET)
    public List<DruidEntity> getDruidList(){
        return druidService.getDruidList();
    }

}

