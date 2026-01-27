package com.gabriel.ecommerce.dto.cart;

import java.math.BigDecimal;

public record CartItemResponseDto(

        Long productId,
        String name,
        String description,
        BigDecimal price,
        int stock,
        int quantity
) {
}
