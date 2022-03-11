package br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.repositories;

import br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.documents.MessageDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<MessageDocument, String> {

}