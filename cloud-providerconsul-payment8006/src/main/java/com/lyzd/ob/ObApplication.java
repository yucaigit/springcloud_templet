package com.lyzd.ob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ObApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObApplication.class, args);
    }

}
