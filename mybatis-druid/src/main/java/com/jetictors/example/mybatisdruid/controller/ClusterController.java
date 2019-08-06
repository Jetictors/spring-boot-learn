package com.jetictors.example.mybatisdruid.controller;

import com.jetictors.example.mybatisdruid.model.ClusterEntity;
import com.jetictors.example.mybatisdruid.service.ClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc           :  Cluster控制类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:25
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@RestController
@RequestMapping("/test")
public class ClusterController {

    @Autowired
    private ClusterService clusterService;

    @RequestMapping(value = "/cluster/clusterId/{clusterId}", method = RequestMethod.GET)
    public ClusterEntity getClusterByClusterIdOne(@PathVariable int clusterId){
        return clusterService.getClusterByClusterId(clusterId);
    }


    @RequestMapping(value = "/cluster/clusterId/once", method = RequestMethod.GET)
    public ClusterEntity getClusterByClusterIdTwo(@RequestParam("clusterId") int clusterId){
        return clusterService.getClusterByClusterId(clusterId);
    }

    @RequestMapping(value = "/cluster/masterId/{masterId}", method = RequestMethod.GET)
    public List<ClusterEntity> getClusterByMasterIdOne(@PathVariable int masterId){
        return clusterService.getClusterByMasterId(masterId);
    }


    @RequestMapping(value = "/cluster/masterId/once", method = RequestMethod.GET)
    public List<ClusterEntity> getClusterByMasterIdTwo(@RequestParam("masterId") int masterId){
        return clusterService.getClusterByMasterId(masterId);
    }

    @RequestMapping(value = "/cluster/all", method = RequestMethod.GET)
    public List<ClusterEntity> getClusterList(){
        return clusterService.getClusterList();
    }

}

