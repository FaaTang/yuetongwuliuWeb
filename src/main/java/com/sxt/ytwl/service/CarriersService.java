package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.CarriersMapper;
import com.sxt.ytwl.model.Carriers;
import com.sxt.ytwl.model.User;
import com.sxt.ytwl.utils.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarriersService {
    @Autowired
    CarriersMapper carriersMapper;
    public Integer addTask(Carriers carriers) {
        carriers.setCheckintime(new Date());
        carriers.setFkUserid(((User) SecurityUtils.getSubject().getSession().getAttribute("user")).getUserid());
        return carriersMapper.insertSelective(carriers);
    }

    public List<Carriers> getAllByPage(Integer page, Integer size, String keyword) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return carriersMapper.getAllByPage(page,size,keyword,UserUtils.getCurrentUser().getUserid());
    }

    public long getTotal(String keyword) {
        return carriersMapper.getTotal(keyword,UserUtils.getCurrentUser().getUserid());
    }

    public Integer deleteById(Integer id) {
        return carriersMapper.deleteByPrimaryKey(id);
    }

    public Integer updateById(Carriers carriers) {
        return carriersMapper.updateByPrimaryKeySelective(carriers);
    }


    public List<Carriers> getAllByPage2(Integer page, Integer size, Integer state) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return carriersMapper.getAllByPage2(page, size, state,UserUtils.getCurrentUser().getUserid());
    }

    public long getTotal2(Integer state) {
        return carriersMapper.getTotal2(state,UserUtils.getCurrentUser().getUserid());
    }

    public Integer updateById2(Integer carriersid) {
        Carriers carriers = new Carriers();
        carriers.setCarriersid(carriersid);
        carriers.setFinishedstate(2);
        return carriersMapper.updateByPrimaryKeySelective(carriers);
    }
}
