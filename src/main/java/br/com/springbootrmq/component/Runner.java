package br.com.springbootrmq.component;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.springbootrmq.SpringbootrabbitmqApplication;

@Component
public class Runner implements CommandLineRunner{
	
	private final RabbitTemplate rabbitTemplate;
    private final Receiver receptor;

    public Runner(Receiver receptor, RabbitTemplate rabbitTemplate) {
        this.receptor = receptor;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Enviando mensagem...");
        rabbitTemplate.convertAndSend(
        		SpringbootrabbitmqApplication.topicExchangeName, 
        		SpringbootrabbitmqApplication.routerName, "Hello RabbitMQ!");
        receptor.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }


}
