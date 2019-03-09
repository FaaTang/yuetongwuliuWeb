package com.sxt.ytwl.controller.truck;

import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.Truckteam;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.TruckTeamService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/truck/team")
public class TruckTeamController {
    @Autowired
    TruckTeamService truckTeamService;
    @PostMapping("/")
    public RespBean addTruckTeam(@RequestBody Truckteam truckteam){
        if (truckTeamService.addTruckTeam(truckteam)==1) {
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @GetMapping("/")
    public respPageBean getAllTeam(Integer page, Integer size, Date[] daterange, String keyword){
        respPageBean resp = new respPageBean();
        List<Truckteam> allTeam = truckTeamService.getAllTeam(page,size,daterange,keyword);
        resp.setData(allTeam);
        resp.setTotal(truckTeamService.getTotal(daterange,keyword));
        return resp;
    }
    @PutMapping("/")
    public RespBean updateTruckTeamById(@RequestBody Truckteam truckteam) {
        if (truckTeamService.updateTruckTeamById(truckteam) == 1) {
            return RespBean.ok("修改成功!");
        }
        return RespBean.error("修改失败!请检查修改内容!");
    }
    @DeleteMapping("/{id}")
    public RespBean deleteTruckTeamById(@PathVariable Integer id){
        if (truckTeamService.deleteTruckTeamById(id)==1) {

        return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败");
    }
}
