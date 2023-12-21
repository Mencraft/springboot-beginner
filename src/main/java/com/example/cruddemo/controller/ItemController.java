package com.example.cruddemo.controller;
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

import com.example.cruddemo.model.Item;
import com.example.cruddemo.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
  @Autowired
  private ItemService itemService;

  @GetMapping
  public List<Item> findAllItems() {
    return itemService.findAllItems();
  }

  @GetMapping("/{id}")
  public Item getItemById(Long id) {
    return itemService.findById(id);
  }

  @PostMapping
  public Item createItem(@RequestBody Item item) {
    return itemService.save(item);
  }

  @PutMapping("/{id}")
  public Item updateItem(@PathVariable Long id, @RequestBody Item updatedItem) {
    return itemService.save(updatedItem);
  }

  @DeleteMapping("/{id}")
  public void deleteItem(@PathVariable Long id) {
    itemService.deleteById(id);
  }

}
