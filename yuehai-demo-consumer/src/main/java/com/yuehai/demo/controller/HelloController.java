package com.yuehai.demo.controller;

import com.yuehai.demo.entity.User;
import com.yuehai.demo.feign.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/9/10
 */
@RestController
public class HelloController {

    @Autowired
    private DemoClient demoClient;

    @GetMapping("/hello")
    public String hello() {
        return demoClient.hello();
    }

    @GetMapping("/users")
    public List<User> users() {
        return demoClient.findAll(1, 100);
    }
}
