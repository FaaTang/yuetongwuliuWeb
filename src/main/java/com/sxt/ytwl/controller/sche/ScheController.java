package com.sxt.ytwl.controller.sche;

import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.Truck;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.CarriersService;
import com.sxt.ytwl.service.SchedulingService;
import com.sxt.ytwl.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
//11111
@RestController
@RequestMapping("/sche")
public class ScheController {
    @Autowired
    TruckService truckService;
    @Autowired
    SchedulingService schedulingService;
    @GetMapping("/")
    public respPageBean getAllByPage(Integer page,Integer size) {
        respPageBean resp = new respPageBean();
        resp.setData(schedulingService.getAllByPage(page,size));
        resp.setTotal(schedulingService.getTotal());
        return resp;
    }
    @GetMapping("/carriers4")
    public respPageBean getAllByPage3(Integer page,Integer size) {
        respPageBean resp = new respPageBean();
        resp.setData(schedulingService.getAllByPage3(page,size,3));
        resp.setTotal(schedulingService.getTotal3(3));
        return resp;
    }
    @PostMapping("/")
    public RespBean sche(Integer carriersid, Integer truckid, String startTime,Float oilcost,Float toll,Float fine, Float othercost,Float totalcost) {
        if (schedulingService.updateSche(carriersid, truckid, startTime,oilcost,toll,fine,othercost,totalcost)) {
            return RespBean.ok("调度成功");
        }
        return RespBean.error("调度失败");
    }
    @GetMapping("/carriers")
    public respPageBean getAllByPage(Integer page,Integer size,@RequestParam(defaultValue = "0") Integer state){
        respPageBean resp = new respPageBean();
        resp.setData(schedulingService.getAllByPage2(page,size,state));
        resp.setTotal(schedulingService.getTotal2(state));
        return resp;
    }
    @GetMapping("/truck")
    public List<Truck> getTrucksForTonnage(){
        return truckService.getTrucksForTonnage(2);
    }
}
