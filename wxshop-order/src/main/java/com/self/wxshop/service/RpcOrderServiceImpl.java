package com.self.wxshop.service;

import com.self.wxshop.api.rpc.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${wxshop.orderservice.version}")
public class RpcOrderServiceImpl implements OrderService {

    @Override
    public String rpcVersion(String name) {
        System.out.println("rpc->rpcVersion");
        return "rpc : " + name;
    }

}
