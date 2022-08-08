package com.lyzd.getway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class GetwayApplication {

    public static void main(String[] args) {
        log.info(GetwayApplication.class.getCanonicalName());
        SpringApplication.run(GetwayApplication.class, args);
    }

}
