package com.spring.restaurant.controller;

import com.spring.restaurant.model.Category;
import com.spring.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//psk on vas travailler avec une API
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/")
public class CategoryController {
    CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    //BASE CRUD....http://localhost:8080/
    @GetMapping("allCategories")
    public List<Category> getAllCategory(){
        return categoryService.allCategories();
    }

}
