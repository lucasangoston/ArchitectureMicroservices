package io.swagger.kafka;

import io.swagger.model.BusinessAddress;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "billing_topic", groupId = "billing_id")
    public void consumeMessage(BusinessAddress message){
        System.out.println(message);
    }
}
