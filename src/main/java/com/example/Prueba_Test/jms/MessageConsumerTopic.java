package com.example.Prueba_Test.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerTopic {

    @JmsListener(destination = "mi-topic" ,containerFactory = "configTopic", subscription = "Mi suscripcion :D")
    public void topic(String message){
        System.out.println("Mensaje del topic "+message+" recibido");


    }

}
