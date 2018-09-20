package br.com.springbootrmq.component;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Mensagem Recebida ---> " + message);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
