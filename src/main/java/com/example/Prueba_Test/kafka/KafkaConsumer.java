package com.example.Prueba_Test.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

   /* @KafkaListener(topics = "TopicComida", groupId = "grupo-comidaxddd")
    public void escuchar(String mensaje){

        log.info(mensaje);

    }*/
}
