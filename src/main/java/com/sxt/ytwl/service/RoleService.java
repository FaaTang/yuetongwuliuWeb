package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.RoleMapper;
import com.sxt.ytwl.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public Role getRoleByI(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }
}
