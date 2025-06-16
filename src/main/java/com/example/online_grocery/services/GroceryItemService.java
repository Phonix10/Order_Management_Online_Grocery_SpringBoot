package com.example.online_grocery.services;

import java.util.List;

import com.example.online_grocery.Entities.GroceryItem;

public interface GroceryItemService{
    List<GroceryItem> getAllGroceryItems();
    GroceryItem getGroceryItemById(Long id);
    GroceryItem createGroceryItem(GroceryItem groceryItem);
    GroceryItem updateGroceryItem(Long id, GroceryItem groceryItemDetails);
    void deleteGroceryItem(Long id);
}