package com.example.rabbit.direct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @Author CJM
 * @Date 2020/10/4  19:41
 */
@Component
public class DirectSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void send1() {
        String msg = "Message1";
        System.out.println("Sender：" + msg);
        rabbitTemplate.convertAndSend("directExchange","routeKey1",msg);
    }
    public void send2() {
        String msg = "Message2";
        System.out.println("Sender：" + msg);
        rabbitTemplate.convertAndSend("directExchange", "routeKey2",msg);
    }
}
