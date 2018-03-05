package com.tenelema.mesagge;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenelema.entities.Instrumento;

@Service
public class ConsumerConfig {

	@Autowired
	private SenderNotify senderNotify;
	
	@RabbitListener(queues="${rabbitmq.queue}")
	public void recievedMessage(Instrumento instrument) {
        senderNotify.sender(instrument.getInstrumentId());
        System.out.println("Recieved Instrument: " + instrument);
    }
}
