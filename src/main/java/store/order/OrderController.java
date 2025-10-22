package store.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public interface OrderController {

  @PostMapping("/order")
  public ResponseEntity<OrderOut> create(
      @RequestHeader("id-account") String idAccount,
      @RequestBody OrderIn in
);

  @GetMapping("/order/{id}")
  public ResponseEntity<OrderOut> findById(
      @RequestHeader("id-account") String idAccount,
      @PathVariable Long id);

  @GetMapping("/order")
  public ResponseEntity<List<OrderOut>> findAll(
      @RequestHeader("id-account") String idAccount);

  @DeleteMapping("/order/{id}")
  public ResponseEntity<Void> delete(
      @RequestHeader("id-account") String idAccount,
      @PathVariable Long id);
}
