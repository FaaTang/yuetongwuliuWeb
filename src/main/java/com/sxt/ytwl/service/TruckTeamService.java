package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.TruckteamMapper;
import com.sxt.ytwl.model.Truckteam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TruckTeamService {
    @Autowired
    TruckteamMapper truckteamMapper;
    public Integer addTruckTeam(Truckteam truckteam) {
        return truckteamMapper.insertSelective(truckteam);
    }

    public List<Truckteam> getAllTeam(Integer page, Integer size, Date[] daterange, String keyword) {
        if (page!=null &&size!=null){
            page=(page-1)*size;
        }
        return truckteamMapper.getAllTeam(page,size,daterange,keyword);
    }

    public Integer updateTruckTeamById(Truckteam truckteam) {
        return truckteamMapper.updateByPrimaryKeySelective(truckteam);
    }

    public Integer deleteTruckTeamById(Integer id) {
        return truckteamMapper.deleteByPrimaryKey(id);
    }

    public Integer getTotal(Date[] daterange, String keyword) {
        return truckteamMapper.getTotal(daterange,keyword);
    }
}
