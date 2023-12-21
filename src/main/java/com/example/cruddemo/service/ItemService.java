package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.repository.ItemRepository;

import com.example.cruddemo.model.Item;

@Service
public class ItemService {
  @Autowired
  private ItemRepository itemRepository;
  
  public List<Item> findAllItems() {
    return itemRepository.findAll();
  }

  public Item findById(Long id) {
    return itemRepository.findById(id).orElse(null);
  }

  public Item save(Item item) {
    return itemRepository.save(item);
  }


  public void deleteById(Long id) {
    itemRepository.deleteById(id);
  }
}
