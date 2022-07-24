package io.swagger.kafka;

import io.swagger.model.BusinessAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {
    private final Producer producer;

    @Autowired
    public BillingController(Producer producer){
        this.producer = producer;
    }

    @PostMapping("/send")
    public void messageToPic(@RequestBody BusinessAddress message){this.producer.sendMessage(message);}
}
