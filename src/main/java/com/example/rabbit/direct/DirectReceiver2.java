package com.example.rabbit.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author CJM
 * @Date 2020/10/4  19:41
 */
@Component
public class DirectReceiver2 {
    @RabbitListener(queues = "direct2")
    public void receiveDirect2(String msg) {
        System.out.println("DirectReceiver2：" + msg);
    }
}
