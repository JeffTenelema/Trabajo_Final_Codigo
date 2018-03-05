package com.tenelema.message;

import org.springframework.stereotype.Component;

import com.tenelema.entities.Instrumento;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class ProducerConfig {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingKey;

    public void sendMessage(Instrumento instrument) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(exchange, routingKey, instrument);
        System.out.println(":"+instrument);
    }

}
