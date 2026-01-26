package com.gabriel.ecommerce.dto.cart;

public record AddtoCartRequestDto(

        Long productId,
        int quantity
) {
}
