package br.com.zup.msgrabbitmq.controllers;

import br.com.zup.msgrabbitmq.dtos.PersonDto;
import br.com.zup.msgrabbitmq.services.MessagingRabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/people")
public class MessagingController {

    @Autowired
    private MessagingRabbitMqService messagingRabbitMqService;

    @PostMapping
    public ResponseEntity<?> send(@RequestBody PersonDto personDto) {
        messagingRabbitMqService.sendMessage("zup-queue", personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(personDto);
    }

}
