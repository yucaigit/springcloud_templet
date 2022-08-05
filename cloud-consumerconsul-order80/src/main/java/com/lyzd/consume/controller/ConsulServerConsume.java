package com.lyzd.consume.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsulServerConsume {

    @RequestMapping("/test")
    public void test(){
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject("http://localhost:8006/payment/consul", String.class);
        System.out.println(forObject);
    }
}
