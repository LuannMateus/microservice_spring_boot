package com.luan.shopping_cart.shopping_cart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private Long productId;
    private Integer amount;

    @Override
    public String toString() {
        return "Item{" +
                "productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
