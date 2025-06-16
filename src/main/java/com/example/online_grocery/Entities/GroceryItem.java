package com.example.online_grocery.Entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private double price;
    private int quantity;

    @ManyToMany(mappedBy = "groceryItems")
    private List<Order> orders;
}