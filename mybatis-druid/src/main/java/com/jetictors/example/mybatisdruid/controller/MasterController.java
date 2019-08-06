package com.jetictors.example.mybatisdruid.controller;

import com.jetictors.example.mybatisdruid.model.MasterEntity;
import com.jetictors.example.mybatisdruid.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  Master控制类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:25
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@RestController
@RequestMapping("/test")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @RequestMapping(value = "/master/{masterId}", method = RequestMethod.GET)
    public MasterEntity getMasterByIdOne(@PathVariable int masterId){
        return masterService.getMasterById(masterId);
    }


    @RequestMapping(value = "/master/once", method = RequestMethod.GET)
    public MasterEntity getMasterByIdTwo(@RequestParam("masterId") int masterId){
        return masterService.getMasterById(masterId);
    }

    @RequestMapping(value = "/master/all", method = RequestMethod.GET)
    public List<MasterEntity> getMasterList(){
        return masterService.getMasterList();
    }

}

