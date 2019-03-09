package com.sxt.ytwl.controller.task;

import com.sxt.ytwl.mapper.CarriersMapper;
import com.sxt.ytwl.model.Carriers;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.CarriersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class WriteOrderController {
    @Autowired
    CarriersService carriersService;

    @PostMapping("/")
    public RespBean addTask(@RequestBody Carriers carriers) {
        if (carriersService.addTask(carriers) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @GetMapping("/")
    public respPageBean getAllByPage(Integer page, Integer size, String keyword) {
        respPageBean resp = new respPageBean();
        resp.setData(carriersService.getAllByPage(page, size, keyword));
        resp.setTotal(carriersService.getTotal(keyword));
        return resp;
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (carriersService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败");
    }

    @PutMapping("/")
    public RespBean updateByI(@RequestBody Carriers carriers) {
        if (carriersService.updateById(carriers) == 1) {
            return RespBean.ok("修改成功！");
        }
        return RespBean.error("修改失败");
    }
}
