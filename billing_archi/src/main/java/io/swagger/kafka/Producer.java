package io.swagger.kafka;

import io.swagger.model.BusinessAddress;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "contract_topic";

    @Autowired
    private KafkaTemplate<String, BusinessAddress> kafkaTemplate;

    public void sendMessage(BusinessAddress message){
        this.kafkaTemplate.send(TOPIC, message);
    }

    @Bean
    public NewTopic createTopic(){return new NewTopic(TOPIC, 3, (short) 1);}
}
