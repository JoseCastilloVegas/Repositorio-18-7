package com.example.Prueba_Test.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "mi-cola")
    public void receiveMessage(String message) {
        System.out.println("Mensaje recibido: " + message);
    }
}

