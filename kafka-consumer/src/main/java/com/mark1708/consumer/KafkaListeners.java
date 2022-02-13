package com.mark1708.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topicName", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🎉");
    }
}
