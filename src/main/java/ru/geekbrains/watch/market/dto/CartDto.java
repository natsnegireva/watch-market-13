package ru.geekbrains.watch.market.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.watch.market.beans.Cart;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Data
public class CartDto {
    private List<OrderItemDto> items;
    private int totalPrice;
    private String address;


    public CartDto(Cart cart) {
        this.totalPrice = cart.getTotalPrice();
        this.address = null;
        this.items = cart.getItems().stream().map(OrderItemDto::new).collect(Collectors.toList());
    }
}