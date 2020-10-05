package com.example.rabbit.headers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author CJM
 * @Date 2020/10/4  18:12
 */
@Component
public class HeadersSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send1(String msg) {
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("queue", "queue1");
        messageProperties.setHeader("bindType", "whereAll");
        Message message = new Message(msg.getBytes(), messageProperties);
        System.out.println("Sender："+msg);
        rabbitTemplate.convertAndSend("headerExchange", null, message);
    }
    public void send2(String msg) {
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("queue", "queue2");
        messageProperties.setHeader("bindType", "whereAny");
        Message message = new Message(msg.getBytes(), messageProperties);
        System.out.println("Sender："+msg);
        rabbitTemplate.convertAndSend("headerExchange", null, message);
    }
}