package com.example.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExamSender2 {
	@Autowired
	private AmqpTemplate rabbitTemplate;
	public void send(int i) {
		String context = "SpringBoot exam queue："+i;
		System.out.println("Sender2 : " + context);
		this.rabbitTemplate.convertAndSend("exam", context);
	}
}