package com.luan.shopping_cart.shopping_cart.controller;

import com.luan.shopping_cart.shopping_cart.model.Cart;
import com.luan.shopping_cart.shopping_cart.model.Item;
import com.luan.shopping_cart.shopping_cart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartController {

    private CartService cartService;

    @GetMapping
    public Iterable<Cart> findAll() {
        return this.cartService.findAll();
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@PathVariable Long id, @RequestBody List<Item> items) {
        this.cartService.save(id, items);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        this.cartService.deleteById(id);
    }
}
