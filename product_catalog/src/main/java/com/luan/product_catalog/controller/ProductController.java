package com.luan.product_catalog.controller;

import com.luan.product_catalog.model.Product;
import com.luan.product_catalog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Product product) {
        this.productService.save(product);
    }
}
