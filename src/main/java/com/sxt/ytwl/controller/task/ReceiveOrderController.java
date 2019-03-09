package com.sxt.ytwl.controller.task;

import com.sxt.ytwl.model.Carriers;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.CarriersService;
import com.sxt.ytwl.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task/rece")
public class ReceiveOrderController {
    @Autowired
    CarriersService carriersService;
    @GetMapping("/")
    public respPageBean getAllByPage(Integer page, Integer size,Integer state) {
        respPageBean resp = new respPageBean();
        resp.setData(carriersService.getAllByPage2(page, size, 1));
        resp.setTotal(carriersService.getTotal2(1));
        return resp;
    }
    @PutMapping("/")
    public RespBean updateById(@RequestParam Integer carriersid){
        if (carriersService.updateById2(carriersid)==1) {

        return RespBean.ok("签收成功！");
        }
        return RespBean.error("签收失败！");
    }

}
