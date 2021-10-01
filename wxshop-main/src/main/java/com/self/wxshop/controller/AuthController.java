package com.self.wxshop.controller;

import com.self.wxshop.api.rpc.OrderService;
import com.self.wxshop.utils.RedisUtils;
import com.self.wxshop.entity.User;
import com.self.wxshop.service.impl.AuthServiceImpl;
import com.self.wxshop.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AuthServiceImpl authService;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RedisUtils redisUtils;

    @Reference(version = "${wxshop.orderservice.version}")
    OrderService orderService;


    @PostMapping("/code")
    public void code() {
        authService.sendVerificationCode("");
    }

    @PostMapping("/login")
    public void login() {

    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @GetMapping("/data")
    public Object data() {
        logger.info("1111");
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

    @GetMapping("/rpc")
    public Object rpc() {
        return orderService.rpcVersion("aaa");
    }

}
