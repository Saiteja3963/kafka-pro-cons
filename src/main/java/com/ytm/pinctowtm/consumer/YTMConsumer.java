package com.ytm.pinctowtm.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class YTMConsumer {

    @KafkaListener(topics = "ytm-pinc-to-wtm", containerFactory = "kafkaListenerContainerFactory", groupId = "ytm-pinc-to-wtm")
    public void sampleConsumer() {

    }
}
