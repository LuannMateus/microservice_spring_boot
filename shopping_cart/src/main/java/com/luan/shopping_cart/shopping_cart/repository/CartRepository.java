package com.luan.shopping_cart.shopping_cart.repository;

import com.luan.shopping_cart.shopping_cart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
