package com.self.wxshop.service;

public interface SmsService {
    /**
     * 发送验证码
     *
     * @param phone 手机号
     * @return 验证码
     */
    String sendSmsCode(String phone);
}
