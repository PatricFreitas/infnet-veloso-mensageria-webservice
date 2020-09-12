package br.com.patricfreitas;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/send")
    public void sendToConsumer() {    	
        rabbitTemplate.convertAndSend("helloExchange", "helloRoutingKey", "Hello");
    }

}
