package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.TruckMapper;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.Truck;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TruckService {
    @Autowired
    TruckMapper truckMapper;
    public Integer addTruck(Truck truck) {
        return truckMapper.insertSelective(truck);
    }

    public List<Truck> queryAllByPage(Integer page, Integer size, Date[] daterange,String type) {
        if (page!=null&&size!=null){
            page=(page-1)*size;
        }
        return truckMapper.queryByPage(page,size,daterange,type);
    }

    public Integer deleteTruckById(Integer truckid) {
        return truckMapper.deleteByPrimaryKey(truckid);
    }

    public Truck queryById(Integer truckid) {
        return truckMapper.selectByPrimaryKey(truckid);
    }

    public Integer updateById(Truck truck) {
        return truckMapper.updateByPrimaryKeySelective(truck);
    }

    public List<String> getByTypes() {
        return truckMapper.getByTypes();
    }

    public long getTotal(Date[] daterange, String type) {
        return truckMapper.getTotal(daterange,type);
    }

    public List<Truck> getTrucksForTonnage(Integer state) {
        return truckMapper.getTrucksForTonnage(state);
    }
}
