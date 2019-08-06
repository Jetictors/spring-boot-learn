package com.jetictors.example.mybatisdruid.service.impl;

import com.jetictors.example.mybatisdruid.dao.master.MasterDao;
import com.jetictors.example.mybatisdruid.model.MasterEntity;
import com.jetictors.example.mybatisdruid.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc           :  业务实现类
 * Author         :  Jetictors
 * Time           :  2019/8/6 17:19
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterDao masterDao;

    @Override
    public MasterEntity getMasterById(int masterId) {
        return masterDao.getMasterById(masterId);
    }

    @Override
    public List<MasterEntity> getMasterList() {
        return masterDao.getMasterList();
    }
}

