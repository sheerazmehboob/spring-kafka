package com.kafka.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "producer_topic", groupId = "group-1")
    void listener(String data){
        System.out.println("Listener Received : " +data + " \uD83C\uDF89");
    }
}
