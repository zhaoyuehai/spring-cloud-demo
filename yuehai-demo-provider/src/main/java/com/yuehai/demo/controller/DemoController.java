package com.yuehai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyuehai 2018/9/10
 */
@RestController
@RequestMapping("/yuehai/demo")
public class DemoController {


    @GetMapping("/hello")
    public String hello() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String s = format.format(new Date(System.currentTimeMillis()));
        return "Hi,This is yuehai-demo-provider! Time --> " + s;
    }
}
