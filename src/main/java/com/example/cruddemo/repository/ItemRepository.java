package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruddemo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
