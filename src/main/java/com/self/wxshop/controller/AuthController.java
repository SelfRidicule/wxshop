package com.self.wxshop.controller;

import com.self.wxshop.RedisUtils;
import com.self.wxshop.entity.User;
import com.self.wxshop.service.impl.AuthServiceImpl;
import com.self.wxshop.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthServiceImpl authService;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RedisUtils redisUtils;


    @PostMapping("/code")
    public void code() {
        authService.sendVerificationCode("");
    }

    @PostMapping("/login")
    public void login() {

    }

    @GetMapping("/data")
    public Object data() {
        return new User();
    }

    @GetMapping("/addUser")
    public Object addUser() {
        return userService.createUserIfNotExist("123456");
    }

    @GetMapping("/set")
    public Object set(String key, String value) {
        return redisUtils.set(key, value);
    }

    @GetMapping("/get")
    public Object get(String key) {
        return redisUtils.get(key);
    }

}
