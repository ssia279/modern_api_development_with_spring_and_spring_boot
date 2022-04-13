package com.packt.modern.api.controllers;

import com.packt.modern.api.CartApi;
import com.packt.modern.api.model.Cart;
import com.packt.modern.api.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class CartsController implements CartApi {

  private static final Logger log = LoggerFactory.getLogger(CartsController.class);

  @Override
  public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
    log.info("Request for customer ID:{}\nItem: {}", customerId, item);
    return ResponseEntity.ok(Collections.EMPTY_LIST);
  }

  @Override
  public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, Item item) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteCart(String customerId) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
    return null;
  }
}
