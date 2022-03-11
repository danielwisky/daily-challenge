package br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.documents;

import br.com.danielwisky.dailychallenge.domains.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class MessageDocument {

  @Id
  private String id;
  private String content;

  public MessageDocument(final Message message) {
    this.id = message.getId();
    this.content = message.getContent();
  }

  public Message toDomain() {
    final Message message = new Message();
    message.setId(this.id);
    message.setContent(this.content);
    return message;
  }
}