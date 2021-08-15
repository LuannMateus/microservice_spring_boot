package com.luan.product_catalog.service;

import com.luan.product_catalog.model.Product;
import com.luan.product_catalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public void save(Product product) {
        this.productRepository.save(product);
    }
}
