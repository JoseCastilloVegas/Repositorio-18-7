package com.example.Prueba_Test.jms;

import jakarta.jms.JMSException;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public DefaultJmsListenerContainerFactory configTopic() throws JMSException {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");
        connectionFactory.setUser("artemis");
        connectionFactory.setPassword("artemis");
        connectionFactory.setClientID("miClienteDurableFijoDefinitivo");// obligatorio para listener durable
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(true); // topic
        factory.setSubscriptionDurable(true);
        return factory;
    }


}
