package com.gabriel.ecommerce.repository;

import com.gabriel.ecommerce.entity.Cart;
import com.gabriel.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByUser(User user);

}
