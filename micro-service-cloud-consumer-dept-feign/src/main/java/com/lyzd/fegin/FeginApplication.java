package com.lyzd.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class, args);
    }

}
