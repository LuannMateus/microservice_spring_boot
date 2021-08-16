package com.luan.shopping_cart.shopping_cart.service;

import com.luan.shopping_cart.shopping_cart.model.Cart;
import com.luan.shopping_cart.shopping_cart.model.Item;
import com.luan.shopping_cart.shopping_cart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartService {
    private CartRepository cartRepository;

    public Iterable<Cart> findAll() {
        return this.cartRepository.findAll();
    }

    public Cart findById(Long id) throws Error {
        return this.cartRepository.findById(id).orElseThrow(Error::new);
    }

    public void save(Long id, List<Item> items) {
        Cart cart = new Cart();

        Optional<Cart> cartExists = this.cartRepository.findById(id);

        if (cartExists.isPresent()) {
            cart = cartExists.get();
            cart.getItems().addAll(items);
        } else {
            cart.setId(id);
            cart.setItems(items);
        }

        this.cartRepository.save(cart);
    }

    public void deleteById(Long id) {
        this.cartRepository.deleteById(id);
    }
}
