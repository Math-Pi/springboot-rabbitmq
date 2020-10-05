package com.example.rabbit.headers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author CJM
 * @Date 2020/10/4  18:17
 */
@Component
public class HeadersReceiver2 {
    @RabbitListener(queues = "header2")
    public void receive2(String msg) {
        System.out.println("HeadersReceiver2接收的消息：" + msg);
    }
}
