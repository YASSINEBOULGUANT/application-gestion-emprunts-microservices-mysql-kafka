package com.org.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "emprunt-created", groupId = "notification-group")
    public void consume(Map<String, Object> event) {
        System.out.println("Received Kafka Event: " + event);
        System.out.println("Processing notification for Emprunt ID: " + event.get("empruntId"));
        // Simulating notification logic
        System.out.println("Notification sent to User " + event.get("userId") + " for Book " + event.get("bookId"));
    }
}
