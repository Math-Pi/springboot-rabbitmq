package com.example.rabbit.headers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author CJM
 * @Date 2020/10/4  18:17
 */
@Component
public class HeadersReceiver1 {
    @RabbitListener(queues = "header1")
    public void receive1(String msg) {
        System.out.println("HeadersReceiver1接收到的消息：" + msg);
    }
}
