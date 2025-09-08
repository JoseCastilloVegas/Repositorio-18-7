package com.example.Prueba_Test.kafka;


import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    @PostConstruct
    public void enviar(){
        String mensaje= "El ultimo mensaje que mando hoy al topic";
        kafkaTemplate.send("TopicComida","doivnsoci83478",mensaje);
    }



}
