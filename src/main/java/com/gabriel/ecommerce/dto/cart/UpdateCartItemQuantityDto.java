package com.gabriel.ecommerce.dto.cart;

import jakarta.validation.constraints.Min;

public record UpdateCartItemQuantityDto(

        @Min(value=1, message="A quantidade deve ser maior que zero")
        int quantity
) {
}
