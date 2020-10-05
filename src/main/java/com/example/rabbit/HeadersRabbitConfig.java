package com.example.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author CJM
 * @Date 2020/10/4  18:06
 */
@Configuration
public class HeadersRabbitConfig {
    @Bean
    public Queue queue1() {
        return new Queue("header1");
    }
    @Bean
    public Queue queue2() {
        return new Queue("header2");
    }
    @Bean
    public HeadersExchange headersExchange() {
        return new HeadersExchange("headerExchange");
    }
    @Bean
    public Binding binding1() {
        Map<String, Object> header = new HashMap<>();
        header.put("queue", "queue1");
        header.put("bindType", "whereAll");
        return BindingBuilder.bind(queue1()).to(headersExchange()).whereAll(header).match();
    }
    @Bean
    public Binding binding2() {
        HashMap<String, Object> header = new HashMap<>();
        header.put("queue", "queue2");
        header.put("bindType", "whereAny");
        return BindingBuilder.bind(queue2()).to(headersExchange()).whereAny(header).match();
    }
}
