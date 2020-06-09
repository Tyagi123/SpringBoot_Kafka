package com.kafka.controller;

import com.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String topic="Testing";
    private static final String topic_json="Test";


    @GetMapping("/publishmessage")
    public String publishMessage( String message){
       // kafkaTemplate.send(topic,message);
        return "Success";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/addUser")
    public String addUser( String name){
        kafkaTemplate.send(topic_json,new User(name,"IT",12300L));
        return "Success";
    }
}
