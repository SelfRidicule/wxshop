package com.self.wxshop.service.impl;

import com.self.wxshop.dao.UserMapper;
import com.self.wxshop.entity.User;
import com.self.wxshop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User createUserIfNotExist(String tel) {
        User user = new User();
        user.setName(tel);
        user.setHeadImg("/wx/logo");
        user.setCreateTime(new Date());
        userMapper.insert(user);
        return user;
    }

}
