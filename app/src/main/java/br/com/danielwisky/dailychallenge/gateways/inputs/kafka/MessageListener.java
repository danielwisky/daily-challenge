package br.com.danielwisky.dailychallenge.gateways.inputs.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

  @KafkaListener(topics = "daily-challenge.message")
  public void receive(final String message) {
    System.out.println("Received message: " + message);
  }
}