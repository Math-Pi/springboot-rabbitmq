package com.example.rabbitmq;

import com.example.rabbit.headers.HeadersSender;
import com.example.rabbit.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author CJM
 * @Date 2020/10/4  18:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadersTest {
    @Autowired
    private HeadersSender sender;
    @Test
    public void headers1() throws Exception {
        String msg="Message 1";
        sender.send1(msg);
        Thread.sleep(1000*3);
    }
    @Test
    public void headers2() throws Exception {
        String msg="Message 2";
        sender.send2(msg);
        Thread.sleep(1000*3);
    }
}
