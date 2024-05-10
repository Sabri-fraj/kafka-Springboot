package com.sbrfraj.kafka.producer;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
@Slf4j
public class kafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void publishedMessage(String msg){
        log.info(String.format("sending message to sabri on topic :: %s", msg));
        kafkaTemplate.send("firstTopic1",msg);
    }
}
