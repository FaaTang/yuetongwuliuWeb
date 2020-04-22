package com.sxt.ytwl.controller.truck;

import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.Truck;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.TruckService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    TruckService truckService;
    @PostMapping("/")
    public RespBean add(@RequestBody Truck truck){
        if (truckService.addTruck(truck)==1){
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败");
    }
    @GetMapping("/types")
    public List<String> getByTypes(){
        List<String> types = truckService.getByTypes();
        types.add(0, "全部");
        return types;
    }
    @GetMapping("/")
    public respPageBean queryAllByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("daterange") Date[] daterange, @Param("type") String type){
        respPageBean respPageBean = new respPageBean();
        respPageBean.setData(truckService.queryAllByPage(page,size,daterange,type));
        respPageBean.setTotal(truckService.getTotal(daterange,type));
        return respPageBean;
    }
    @GetMapping("/deleteById")
    public RespBean deleteTruckById(Integer truckid){
        if (truckService.deleteTruckById(truckid)==1){
            return RespBean.ok("删除成功");
        }

        return RespBean.error("删除失败");
    }
/*    @GetMapping("/queryById")
    public Truck queryById(Integer truckid){
        return truckService.queryById(truckid);
    }*/
    @PutMapping("/update")
    public RespBean updateTruckById(@RequestBody Truck truck){
        if (truckService.updateById(truck)==1){
            return RespBean.ok("修改成功");
        }
        return RespBean.ok("修改失败");


    }
}
