package com.example.rabbit.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author CJM
 * @Date 2020/10/4  19:41
 */
@Component
public class DirectReceiver1 {
    @RabbitListener(queues = "direct1")
    public void receiveDirect1(String msg) {
        System.out.println("DirectReceiver1：" + msg);
    }
}
