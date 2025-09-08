package com.example.Prueba_Test.jms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final MessageProducer producer;

    private final MessageProducerTopic messageProducerTopic;

    public Runner(MessageProducer producer,MessageProducerTopic messageProducerTopic) {
        this.producer = producer;

        this.messageProducerTopic=messageProducerTopic;

    }

    @Override
    public void run(String... args) throws Exception {
        producer.sendMessage("¡Hola desde JMS!");
        producer.sendMessage("Hola desde JMS 2!");
        producer.sendMessage("Hola desde JMS 3!");
        // messageProducerTopic.sendTopic("Hola soy el topic 1!");
       // messageProducerTopic.sendTopic("Hola soy el topic 2!");


    }
}

