package com.self.wxshop.utils;

import com.self.wxshop.entity.User;

public class UserContextUtils {

    private static ThreadLocal<User> threadLocal = new ThreadLocal<>();

    public static User getUser(){
        return threadLocal.get();
    }

    public static void setUser(User user){
        threadLocal.set(user);
    }

}
