package br.com.danielwisky.dailychallenge.usecases;

import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

import br.com.danielwisky.dailychallenge.gateways.MessageAsyncGateway;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendMessageInBatch {

  private final MessageAsyncGateway messageAsyncGateway;

  public void execute(final Integer size) {
    IntStream
        .rangeClosed(INTEGER_ZERO, size)
        .forEach(this::send);
  }

  private void send(final int value) {
    messageAsyncGateway.send(String.format("message number: %s", value));
  }
}