package com.sxt.ytwl.controller.sys;

import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.User;
import com.sxt.ytwl.model.respPageBean;
import com.sxt.ytwl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public respPageBean getAllUsersByPage(Integer page,Integer size,String keyword) {
        respPageBean resp = new respPageBean();
        resp.setData(userService.getAllUsersByPage(page,size,keyword));
        resp.setTotal(userService.getUserTotal(keyword));
        return resp;
    }
    @GetMapping("/userbyid")
    public User getUserByIdTF(Integer userid){
        User user = userService.getUserByIdTF(userid);
        if (user != null) {

        return user;
        }
        return null;
    }
    @PostMapping("/")
    public RespBean batchDelete(@RequestBody User[] users) {
        return userService.batchDelete(users) == 1 ? RespBean.ok("删除成功!") : RespBean.error("删除失败");

    }
    @PutMapping("/updateUserById")
    public RespBean updateUserById(@RequestBody User user) {
        if (userService.updateUser(user) == 1) {
            return RespBean.ok("修改用户信息成功");
        }
        return RespBean.error("修改用户信息失败");
    }
    @PutMapping("/authorize/{userid}")
    public RespBean authorizeUser(@PathVariable Integer userid){
        userService.authorizeUser(userid);
        return RespBean.ok("授权成功!");
    }
    @GetMapping("/authorizeUserBatch")
    public RespBean authorizeUserBatch(){
        if (userService.updateAuthorizeUserBatch()) {
            return RespBean.ok("全部授权成功!");
        }
            return RespBean.error("授权失败!");
    }
    @PutMapping("/updateUser")
    public RespBean updateUser(@RequestBody User user) {
        if (userService.updateUser(user)==1) {
        return RespBean.ok("修改成功!");
        }
        return RespBean.ok("修改失败!");
    }

}
