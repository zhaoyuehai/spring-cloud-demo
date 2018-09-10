package com.yuehai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyuehai 2018/9/10
 */
@RestController
@RequestMapping("/yuehai")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hi,This is yuehai-demo-provider!";
    }
}
