package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.CarriersMapper;
import com.sxt.ytwl.mapper.SchedulingMapper;
import com.sxt.ytwl.mapper.TruckMapper;
import com.sxt.ytwl.model.Carriers;
import com.sxt.ytwl.model.Scheduling;
import com.sxt.ytwl.model.Truck;
import com.sxt.ytwl.utils.UserUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SchedulingService {
    @Autowired
    CarriersMapper carriersMapper;
    @Autowired
    SchedulingMapper schedulingMapper;
    @Autowired
    TruckMapper truckMapper;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public long getTotal2(Integer state) {
        if (UserUtils.getCurrentUser().getRole().getRoleid() == 2) {
            UserUtils.getCurrentUser().setUserid(null);
        }
        return carriersMapper.getTotal2(state,UserUtils.getCurrentUser().getUserid());
    }

    public List<Carriers> getAllByPage2(Integer page, Integer size, Integer state) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        if (UserUtils.getCurrentUser().getRole().getRoleid() == 2) {
            UserUtils.getCurrentUser().setUserid(null);
        }

        return carriersMapper.getAllByPage2(page,size,state,UserUtils.getCurrentUser().getUserid());
    }

    public boolean updateSche(Integer carriersid, Integer truckid, String startTime, Float oilcost, Float toll, Float fine, Float othercost, Float totalcost) {
        try {
        Carriers carriers = new Carriers();
        carriers.setFinishedstate(1);
        carriers.setCarriersid(carriersid);
        carriersMapper.updateByPrimaryKeySelective(carriers);
        Scheduling scheduling = new Scheduling();
        scheduling.setFkCarriersid(carriersid);
        scheduling.setFkTruckid(truckid);
        scheduling.setStarttime(sdf.parse(startTime));
        scheduling.setFkUserid(UserUtils.getCurrentUser().getUserid());
        scheduling.setCheckintime(new Date());
        scheduling.setOilcost(oilcost);
        scheduling.setToll(toll);
        scheduling.setFine(fine);
        scheduling.setOthercost(othercost);
        scheduling.setTotalcost(totalcost);
            Truck truck = new Truck();
            truck.setState(1);
            truck.setTruckid(truckid);
            truckMapper.updateByPrimaryKeySelective(truck);
        return schedulingMapper.insertSelective(scheduling)==1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Scheduling> getAllByPage(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return schedulingMapper.getAllByPage(page, size);
    }

    public long getTotal() {
        return schedulingMapper.getTotal();
    }

    public List<Truck> getAllByPageCapaCity(Integer page, Integer size, Integer state) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return truckMapper.getAllByPageCapaCity(page,size,state);
    }

    public long getTotalCapaCity(Integer state) {
        return truckMapper.getTotalCapaCity(state);
    }

    public List<Carriers> getAllByPage3(Integer page, Integer size, Integer state) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return carriersMapper.getAllByPage3(page,size,state);
    }

    public long getTotal3(Integer state) {
        return carriersMapper.getTotal3(state);
    }
}
