package com.gabriel.ecommerce.dto.cart;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record AddToCartRequestDto(

        @NotNull(message="O productId é obrigatório")
        Long productId,

        @Min(value=1, message="A quantidade deve ser maior que zero")
        int quantity
) {
}
