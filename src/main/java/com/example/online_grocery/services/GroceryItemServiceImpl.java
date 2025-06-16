package com.example.online_grocery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_grocery.Entities.GroceryItem;
import com.example.online_grocery.repository.GroceryItemRepository;

import java.util.List;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Override
    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemRepository.findAll();
    }

    @Override
    public GroceryItem getGroceryItemById(Long id) {
        return groceryItemRepository.findById(id).orElse(null);
    }


    @Override
    public GroceryItem createGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    @Override
    public GroceryItem updateGroceryItem(Long id, GroceryItem groceryItemDetails) {
        GroceryItem groceryItem = groceryItemRepository.findById(id).orElse(null);
        if (groceryItem != null) {
            groceryItem.setName(groceryItemDetails.getName());
            groceryItem.setCategory(groceryItemDetails.getCategory());
            groceryItem.setPrice(groceryItemDetails.getPrice());
            groceryItem.setQuantity(groceryItemDetails.getQuantity());
            return groceryItemRepository.save(groceryItem);
        }
        return null;
    }

    @Override
    public void deleteGroceryItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}