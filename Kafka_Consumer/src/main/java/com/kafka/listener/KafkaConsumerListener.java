package com.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
    /*
    @KafkaListener(topics="Testing", groupId="group_id")
    public void consume(String message){
        System.out.println("Consumer Message " +message);
    }*/

}
