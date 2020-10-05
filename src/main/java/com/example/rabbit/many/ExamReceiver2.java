package com.example.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "exam")
public class ExamReceiver2 {
    @RabbitHandler
    public void process(String exam) {
        System.out.println("Receiver 2: " + exam);
    }
}
