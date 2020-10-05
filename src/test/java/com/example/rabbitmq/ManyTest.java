package com.example.rabbitmq;

import com.example.rabbit.many.ExamSender1;
import com.example.rabbit.many.ExamSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private ExamSender1 examSender1;
	@Autowired
	private ExamSender2 examSender2;
	//一对多测试
	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<10;i++){
			examSender1.send(i);
		}
	}
	//多对多测试
	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<10;i++){
			examSender1.send(i);
			examSender2.send(i);
		}
	}
}