package com.self.wxshop.service.impl;

import com.self.wxshop.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {
    @Override
    public String sendSmsCode(String phone) {
        return "10086";
    }
}
