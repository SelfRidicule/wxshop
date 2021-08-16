package com.self.wxshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.self.wxshop.dao")
public class WxshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxshopApplication.class, args);
	}

}
