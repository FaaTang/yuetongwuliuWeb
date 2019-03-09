package com.sxt.ytwl.utils;

import com.sxt.ytwl.model.User;
import org.apache.shiro.SecurityUtils;

public class UserUtils {
    public static User getCurrentUser() {
        return ((User) SecurityUtils.getSubject().getSession().getAttribute("user"));
    }
}
