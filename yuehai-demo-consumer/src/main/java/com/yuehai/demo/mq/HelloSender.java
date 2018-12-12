package com.yuehai.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * MQ发送者
 * Created by zhaoyuehai 2018/12/11
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("-----------Sender : " + context);
        rabbitTemplate.convertAndSend("hello",context);
    }
}
