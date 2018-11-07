package com.yuehai.demo;

import com.yuehai.demo.entity.UserBean;
import com.yuehai.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YuehaiDemoProviderApplicationTests {


    @Test
    public void contextLoads() {
    }

    private static Logger logger = LoggerFactory.getLogger("test");

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        List<UserBean> users = userService.getAll(1, 100);
        logger.info(users.toString());
    }
}
