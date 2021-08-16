package com.self.wxshop.service.impl;

import com.self.wxshop.entity.User;
import com.self.wxshop.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    SmsServiceImpl smsService;

    @Override
    public void sendVerificationCode(String tel) {
        User user = userService.createUserIfNotExist(tel);
        String code = smsService.sendSmsCode(tel);
    }

}
