package com.example.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author CJM
 * @Date 2020/10/4  19:36
 */
@Configuration
public class DirectRabbitConfig {
    @Bean
    public Queue directQueue1() {
        return new Queue("direct1");
    }
    @Bean
    public Queue directQueue2() {
        return new Queue("direct2");
    }
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }
    @Bean
    public Binding bindingDirectExchange1() {
        return BindingBuilder.bind(directQueue1()).to(directExchange()).with("routeKey1");
    }
    @Bean
    public Binding bindingDirectExchange2() {
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with("routeKey2");
    }
}
