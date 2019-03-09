package com.sxt.ytwl.realm;

import com.sxt.ytwl.mapper.UserMapper;
import com.sxt.ytwl.model.RespBean;
import com.sxt.ytwl.model.Role;
import com.sxt.ytwl.model.User;
import com.sxt.ytwl.service.RoleService;
import com.sxt.ytwl.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

public class LoginRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute("user");
        Role role = user.getRole();
        Set<String> roles = new HashSet<String>();
        roles.add(role.getRolename());
        return new SimpleAuthorizationInfo(roles);
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String account = (String) token.getPrincipal();
        User user = userService.getByAccount(account);
        if (user == null) {
          /*  if (userService.getByAccountNR(account) != null) {
                throw new UnknownAccountException("账户未授权,请联系管理员");
            }*/
            throw new UnknownAccountException("账户不存在!");

        }
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user", user);
        ByteSource salts = ByteSource.Util.bytes(user.getAccount());
        return new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(),salts, getName());
    }
}
