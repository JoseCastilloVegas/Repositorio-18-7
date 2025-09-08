package com.example.Prueba_Test.kafka;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class KafkaService {

    private final KafkaProducer kafkaProducer;

    public void enviarDesdeServicio(){
        kafkaProducer.enviar();
    }
}
