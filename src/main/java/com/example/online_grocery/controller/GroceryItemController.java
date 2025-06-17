package com.example.online_grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.online_grocery.Entities.GroceryItem;
import com.example.online_grocery.services.GroceryItemService;

@RestController
@RequestMapping("/api/grocery-items")
public class GroceryItemController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping
    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemService.getAllGroceryItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getGroceryItemById(@PathVariable Long id) {
        return groceryItemService.getGroceryItemById(id);
    }

    @PostMapping
    public GroceryItem createGroceryItem(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.createGroceryItem(groceryItem);
    }

    @PutMapping("/{id}")
    public GroceryItem updateGroceryItem(@PathVariable Long id, @RequestBody GroceryItem groceryItemDetails) {
        return groceryItemService.updateGroceryItem(id, groceryItemDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteGroceryItem(@PathVariable Long id) {
        groceryItemService.deleteGroceryItem(id);
    }
    
}
