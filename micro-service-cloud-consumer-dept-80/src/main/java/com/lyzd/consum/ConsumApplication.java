package com.lyzd.consum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumApplication.class, args);
    }

}
