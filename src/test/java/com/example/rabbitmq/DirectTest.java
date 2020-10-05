package com.example.rabbitmq;

import com.example.rabbit.direct.DirectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author CJM
 * @Date 2020/10/4  19:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectTest {
    @Autowired
    private DirectSender sender;
    @Test
    public void direct1() throws Exception {
        sender.send1();
        Thread.sleep(1000*3);
    }
    @Test
    public void direct2() throws Exception {
        sender.send2();
        Thread.sleep(1000*3);
    }
}
