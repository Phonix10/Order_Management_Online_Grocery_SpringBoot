package com.example.online_grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_grocery.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
