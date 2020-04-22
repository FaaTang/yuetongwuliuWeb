package com.sxt.ytwl.controller.driver;

import com.sxt.ytwl.model.Driver;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;
    @GetMapping("/")
    public respPageBean getAllDriversByPage(Integer page, Integer size,String keyword){
     respPageBean respPageBean=new respPageBean();
     respPageBean.setData(driverService.getAllDriversByPage(page,size,keyword));
     respPageBean.setTotal(driverService.getTotalDriver());
     return  respPageBean;
    }
    @PostMapping("/")
    public RespBean addDriverById(@RequestBody Driver driver){
        if(driverService.addDriverById(driver)==1){
            return  RespBean.ok("添加成功！！");
        }
        return  RespBean.error("添加失败!!");
    }
    @DeleteMapping("/{id}")
    public RespBean deleteDriverById(@PathVariable Integer id){
        if(driverService.deleteDriverById(id)==1){
            return  RespBean.ok("删除成功！！");
        }
        return  RespBean.error("删除失败");

    }
    @PutMapping("/")
    public RespBean updateDriverById(@RequestBody Driver driver){
        if(driverService.updateDriverById(driver)==1){
            return  RespBean.ok("更新成功！！");
        }
        return  RespBean.error("更新失败");
    }

}
