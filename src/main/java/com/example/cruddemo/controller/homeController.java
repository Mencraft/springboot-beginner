package com.example.cruddemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class homeController {

  @GetMapping
  public String homeEndpoint() {
        return "Hello From CRUDBY!";
    }
}
