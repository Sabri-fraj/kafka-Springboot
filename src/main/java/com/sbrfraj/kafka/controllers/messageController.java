package com.sbrfraj.kafka.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sbrfraj.kafka.producer.kafkaProducer;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class messageController {

    private final kafkaProducer kafkaProducer;

    @PostMapping
    public ResponseEntity<String> sendMessages (@RequestBody String msg){
        kafkaProducer.publishedMessage(msg);

        return ResponseEntity.ok(msg);
    }

}
