package br.com.danielwisky.dailychallenge.gateways.inputs.http;

import br.com.danielwisky.dailychallenge.usecases.SendInBatchMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageController {

  private final SendInBatchMessage sendInBatchMessage;

  @PostMapping("/send-batch/{size}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public ResponseEntity sendInBatch(@PathVariable final Integer size) {
    sendInBatchMessage.execute(size);
    return ResponseEntity.accepted().build();
  }
}