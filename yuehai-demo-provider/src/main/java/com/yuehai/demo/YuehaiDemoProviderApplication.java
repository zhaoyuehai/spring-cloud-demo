package com.yuehai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YuehaiDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuehaiDemoProviderApplication.class, args);
    }


}