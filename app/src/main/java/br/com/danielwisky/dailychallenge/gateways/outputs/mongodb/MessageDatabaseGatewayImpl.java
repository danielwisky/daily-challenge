package br.com.danielwisky.dailychallenge.gateways.outputs.mongodb;

import br.com.danielwisky.dailychallenge.domains.Message;
import br.com.danielwisky.dailychallenge.gateways.MessageDatabaseGateway;
import br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.documents.MessageDocument;
import br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.repositories.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageDatabaseGatewayImpl implements MessageDatabaseGateway {

  private final MessageRepository messageRepository;

  @Override
  public Message save(final Message message) {
    return messageRepository.save(new MessageDocument(message)).toDomain();
  }
}