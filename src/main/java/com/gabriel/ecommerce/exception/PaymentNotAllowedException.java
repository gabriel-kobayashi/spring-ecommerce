package com.gabriel.ecommerce.exception;

public class PaymentNotAllowedException extends RuntimeException {

    public PaymentNotAllowedException(String message) {
        super(message);
    }
}
