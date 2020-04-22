package com.sxt.ytwl.service;

import com.sxt.ytwl.mapper.UserMapper;
import com.sxt.ytwl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getByAccount(String account) {
        return userMapper.getByAccount(account);
    }

    public int addSelective(User user) {
        return userMapper.insertSelective(user);
    }

    public List<User> getAllUsersByPage(Integer page, Integer size, String keyword) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return userMapper.getAllUsersByPage(page,size,keyword);
    }

    public long getUserTotal(String keyword) {
        return userMapper.getTotal(keyword);
    }


    public Integer batchDelete(User[] users) {
        try {
            for (User user : users) {
                userMapper.deleteByPrimaryKey(user.getUserid());
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Integer authorizeUser(Integer userid) {
        return userMapper.authorizeUser(userid);
    }

    public Integer updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public boolean updateAuthorizeUserBatch() {
        try {
            userMapper.updateAuthorizeUserBatch();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Integer checkAccount(String account) {
        return userMapper.checkAccount(account);
    }

    public User getUserByIdTF(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

 
}
