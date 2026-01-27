package com.gabriel.ecommerce.dto.cart;

import java.math.BigDecimal;
import java.util.List;

public record CartResponseDto(

        Long cartId,
        List<CartItemResponseDto> items
) {
}
