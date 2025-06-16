package com.example.online_grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_grocery.Entities.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
    // Additional query methods can be defined here if needed
    
}
