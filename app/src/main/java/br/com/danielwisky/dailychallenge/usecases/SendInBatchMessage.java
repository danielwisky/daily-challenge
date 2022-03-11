package br.com.danielwisky.dailychallenge.usecases;

import br.com.danielwisky.dailychallenge.gateways.MessageAsyncGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendInBatchMessage {

  private final MessageAsyncGateway messageAsyncGateway;

  public void execute(final Integer size) {

  }
}