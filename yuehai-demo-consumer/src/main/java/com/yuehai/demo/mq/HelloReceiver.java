package com.yuehai.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收者
 * Created by zhaoyuehai 2018/12/11
 */
@Component
public class HelloReceiver {

    @RabbitListener(queues = "hello")
    public void process(String hello) {
        System.out.println("-----------Receiver:" + hello);
    }
}
