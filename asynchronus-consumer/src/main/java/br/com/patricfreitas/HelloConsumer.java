package br.com.patricfreitas;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {
	
	@RabbitListener(queues = {"helloQueue"})
    public void consumer(@Payload String message) {
		System.out.println("Recebido da fila");
        System.out.println(message);
    }

}
