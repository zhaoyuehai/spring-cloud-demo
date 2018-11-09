package com.yuehai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix  //熔断器
@EnableFeignClients //开启OpenFeign负载均衡
public class YuehaiDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuehaiDemoConsumerApplication.class, args);
    }

}
