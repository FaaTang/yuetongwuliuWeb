package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.DriverMapper;
import com.sxt.ytwl.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    DriverMapper driverMapper;
    public List<Driver> getAllDriversByPage(Integer page, Integer size,String keyword) {
        if(page!=null&&size!=null){
            page=(page-1)*size;
        }
        return driverMapper.getAllDriversByPage(page,size,keyword);
    }

    public long getTotalDriver() {
        return driverMapper.getTotalDriver();
    }

    public Integer addDriverById(Driver driver) {
        return driverMapper.insertSelective(driver);
    }

    public Integer deleteDriverById(Integer id) {
        return  driverMapper.deleteByPrimaryKey(id);
    }

    public Integer updateDriverById(Driver driver) {
        return  driverMapper.updateByPrimaryKey(driver);
    }
}
