package com.example.Prueba_Test.jms;

import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageProducerTopic {

    private final JmsTemplate jmsTemplate;

    public void sendTopic(String message){
        jmsTemplate.setPubSubDomain(true); //Topic
        jmsTemplate.convertAndSend("mi-topic",message);
        System.out.println("Mensaje del topic enviado!");
    }





}
