package br.com.danielwisky.dailychallenge.gateways.outputs.kafka;

import br.com.danielwisky.dailychallenge.gateways.MessageAsyncGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageAsyncGatewayImpl implements MessageAsyncGateway {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void send(final String message) {
    kafkaTemplate.send("daily-challenge.message", message);
  }
}