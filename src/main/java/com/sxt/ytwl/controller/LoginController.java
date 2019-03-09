package com.sxt.ytwl.controller;

import com.mysql.jdbc.Security;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.User;
import com.sxt.ytwl.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping("/doLogin")
    public RespBean login(@RequestBody User user) {
        UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(), user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            User obj = (User) subject.getSession().getAttribute("user");
            obj.setPassword(null);
            return RespBean.ok("登录成功", obj);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return RespBean.error("登录失败");
    }

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }

    /*    @DeleteMapping("/logoff")
        public RespBean logOFF(HttpSession session){
            session.removeAttribute("user");
            session.invalidate();
            return RespBean.ok("注销成功");
        }*/


}
