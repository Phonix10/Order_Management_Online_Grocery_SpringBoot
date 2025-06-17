package com.example.online_grocery.services;

import java.util.List;

import com.example.online_grocery.Entities.Order;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(Order order);
    Order updateOrder(Long id, Order orderDetails);
    void deleteOrder(Long id);
    
}
