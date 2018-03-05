package com.tenelema.mesagge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenelema.services.SingerService;

@Service
public class SenderNotify {
	
    @Autowired
    private MessageService messageService;

    @Autowired
    private SingerService singerService;

    public void sender(String instrument) {
        List<String> smms = singerService.findAllEmails();
        String asunto = "Instrumento Agregado";
        String mensaje = "Se ha añadido el instrumento:" + instrument;
        for (String smm : smms) {
            messageService.sendMessage(smm, asunto, mensaje);
        }
    }
}
