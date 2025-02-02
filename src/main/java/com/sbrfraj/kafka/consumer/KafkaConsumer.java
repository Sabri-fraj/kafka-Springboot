package com.sbrfraj.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "firstTopic1",groupId = "firstGroup1")
    public void consumeMsg(String msg){
        log.info(String.format("consuming msg from producer with topic firstTopic :: %s",msg));
    }

}
