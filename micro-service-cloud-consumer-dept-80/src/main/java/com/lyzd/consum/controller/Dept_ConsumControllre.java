package com.lyzd.consum.controller;

import com.lyzd.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//Dept 消费者
@RestController
public class Dept_ConsumControllre {
    //private static final String REST_URL_PROVIDER_PREFIX = "http://localhost:8001/";
    // 这种方式是直调用服务方的方法，根本没有用到 Spring Cloud
    //面向微服务编程，即通过微服务的名称来获取调用地址
    // 这个Url 就是8001 端口中的 spring - appli  name   yml 文件
    private static final String REST_URL_PROVIDER_PREFIX = "http://MICROSERVICECLOUDPROVIDERDEPT";

    //RestTemplate 是一种简单便捷的访问 restful 服务模板类，
    // 是 Spring 提供的用于访问 Rest 服务的客户端模板工具集，提供了多种便捷访问远程 HTTP 服务的方法
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX+"/getAll",List.class);}
}
