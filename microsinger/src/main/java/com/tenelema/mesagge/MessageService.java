package com.tenelema.mesagge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private JavaMailSender jms;
	
	public void sendMessage(
			String destino,
			String asunto,
			String mensaje) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setTo(destino);
		smm.setSubject(asunto);
		smm.setText(mensaje);
		jms.send(smm);
	}

}
