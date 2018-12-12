package com.yuehai.demo.feign;

import com.yuehai.demo.entity.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/9/10
 */
//@FeignClient(value = "DEMO-PROVIDER")
@FeignClient(value = "YUEHAI-DEMO-PROVIDER")
public interface DemoClient {

    @GetMapping("/yuehai/demo/hello")
    String hello();

    @GetMapping("/yuehai/user/all")
    List<UserBean> findAll(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize);

}
