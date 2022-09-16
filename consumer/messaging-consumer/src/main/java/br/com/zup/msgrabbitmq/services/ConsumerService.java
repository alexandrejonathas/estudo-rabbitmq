package br.com.zup.msgrabbitmq.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import br.com.zup.msgrabbitmq.dtos.PersonDto;

@Service
public class ConsumerService {
    @RabbitListener(queues = "zup-queue")
    public void consume(PersonDto message) {
        System.out.println("Person { Name: "+message.getName()+", Age: "+message.getAge()+" }");
    }
}
