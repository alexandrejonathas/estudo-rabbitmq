package br.com.zup.msgrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingConsumerApplication.class, args);
	}

}
