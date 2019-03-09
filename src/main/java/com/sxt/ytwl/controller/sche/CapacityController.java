package com.sxt.ytwl.controller.sche;

import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/capa")
public class CapacityController {
    @Autowired
    SchedulingService schedulingService;
    @GetMapping("/")
    public respPageBean getAllByPageCapaCity(Integer page,Integer size){
        respPageBean resp = new respPageBean();
        resp.setData(schedulingService.getAllByPageCapaCity(page,size,1));
        resp.setTotal(schedulingService.getTotalCapaCity(1));
        return resp;
    }
}
