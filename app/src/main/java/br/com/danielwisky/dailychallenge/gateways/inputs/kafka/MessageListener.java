package br.com.danielwisky.dailychallenge.gateways.inputs.kafka;

import br.com.danielwisky.dailychallenge.usecases.ProcessMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageListener {

  private final ProcessMessage processMessage;

  @KafkaListener(topics = "daily-challenge.message")
  public void receive(final String message) {
    System.out.println("Received message: " + message);
    processMessage.execute(message);
  }
}