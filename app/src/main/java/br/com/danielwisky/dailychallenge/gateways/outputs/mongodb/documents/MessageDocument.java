package br.com.danielwisky.dailychallenge.gateways.outputs.mongodb.documents;

import br.com.danielwisky.dailychallenge.domains.Message;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("messages")
public class MessageDocument {

  @Id
  private String id;
  private String content;
  private LocalDateTime creationDate;

  public MessageDocument(final Message message) {
    this.id = message.getId();
    this.content = message.getContent();
    this.creationDate = message.getCreationDate();
  }

  public Message toDomain() {
    final Message message = new Message();
    message.setId(this.id);
    message.setContent(this.content);
    message.setCreationDate(this.creationDate);
    return message;
  }
}