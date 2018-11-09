package com.yuehai.demo.controller;

import com.yuehai.demo.entity.User;
import com.yuehai.demo.feign.DemoClient;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "Hello word!", notes = "测试远程调用服务提供者provider-8001!")
    @GetMapping("/hello")
    public String hello() {
        return demoClient.hello();
    }

    @ApiOperation(value = "查询用户", notes = "查用户（size=100）")
    @GetMapping("/users")
    public List<User> users() {
        return demoClient.findAll(1, 100);
    }
}
