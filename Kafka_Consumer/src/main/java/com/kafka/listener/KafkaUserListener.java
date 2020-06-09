package com.kafka.listener;

import com.kafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaUserListener {

    @KafkaListener(topics="Test", groupId="test_json",containerFactory =
            "concurrentKafkaListenerContainerFactoryForJson")
    public void consumeJson(User user){
        System.out.println("Consumer Message " +user.toString());
    }
}
