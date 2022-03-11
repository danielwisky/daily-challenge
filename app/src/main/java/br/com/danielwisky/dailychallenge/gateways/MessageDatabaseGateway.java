package br.com.danielwisky.dailychallenge.gateways;

import br.com.danielwisky.dailychallenge.domains.Message;

public interface MessageDatabaseGateway {

  Message save(Message message);
}
