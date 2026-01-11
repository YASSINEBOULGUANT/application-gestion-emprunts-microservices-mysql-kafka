package com.org.emprunt.service;

import com.org.emprunt.model.EmpruntEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, EmpruntEvent> kafkaTemplate;
    private static final String TOPIC = "emprunt-created";

    public KafkaProducerService(KafkaTemplate<String, EmpruntEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEmpruntEvent(EmpruntEvent event) {
        kafkaTemplate.send(TOPIC, event);
    }
}
