package com.sxt.ytwl.controller;

import com.sxt.ytwl.mapper.UserMapper;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.User;
import com.sxt.ytwl.service.UserService;
import com.sxt.ytwl.utils.SHA512ForPwd;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    UserService userService;
    @Autowired
    SHA512ForPwd sha512ForPwd;
    @PostMapping("/register")
    public RespBean register(@RequestBody User user){
        String pwd = sha512ForPwd.encryptPwd(user.getPassword(), user.getAccount(), 1024);
        user.setPassword(pwd);
        Integer fkRoleid = user.getFkRoleid() * 10;
        user.setFkRoleid(fkRoleid);
        if (userService.addSelective(user)==1){
            return RespBean.ok("恭喜您!注册成功!请等待管理员授权!");
        }
        return RespBean.error("对不起!注册失败!");
    }
    @GetMapping("/account")
    public Integer checkAccount(String account) {
        if (userService.checkAccount(account) > 0) {
            return 1;
        }
        return 0;
    }
}
