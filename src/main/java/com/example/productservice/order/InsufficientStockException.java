package com.example.productservice.order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(Long productId, int requested, int available) {
        super("Product " + productId + " is out of stock for requested quantity "
                + requested + " (available: " + available + ")");
    }
}
