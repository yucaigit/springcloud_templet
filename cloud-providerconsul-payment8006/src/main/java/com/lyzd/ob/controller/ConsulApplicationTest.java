package com.lyzd.ob.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulApplicationTest {

    @Value("${server.port}")
    private String server_port;

    @RequestMapping("/payment/consul")
    public String test(){
        return "请求Consul"+server_port;
    }
}
