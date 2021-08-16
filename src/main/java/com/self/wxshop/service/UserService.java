package com.self.wxshop.service;

import com.self.wxshop.entity.User;

public interface UserService {

    User createUserIfNotExist(String tel);
}
