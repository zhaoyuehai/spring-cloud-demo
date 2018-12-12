package com.yuehai.demo;

import com.yuehai.demo.mq.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhaoyuehai 2018/12/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {
    @Autowired
    private HelloSender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
