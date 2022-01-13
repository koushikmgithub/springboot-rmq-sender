package org.km.samples.springbootrmqsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sender")
@Slf4j
public class SenderController {

    public static final String KEDAQ = "kedaQ";

    @Autowired
    RabbitTemplate rabbitTemplate;

   
    @GetMapping("/sendMessage")
    public void send(@RequestParam("msg") String msg){
        log.info("Message sent to kedaQ: {}", msg);
        rabbitTemplate.convertAndSend(KEDAQ, msg);
    }

   

    
    
}
