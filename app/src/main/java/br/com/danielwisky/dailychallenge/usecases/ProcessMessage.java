package br.com.danielwisky.dailychallenge.usecases;

import br.com.danielwisky.dailychallenge.domains.Message;
import br.com.danielwisky.dailychallenge.gateways.MessageDatabaseGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProcessMessage {

  private final MessageDatabaseGateway messageDatabaseGateway;

  public void execute(final String content) {
    messageDatabaseGateway.save(Message.builder().content(content).build());
  }
}