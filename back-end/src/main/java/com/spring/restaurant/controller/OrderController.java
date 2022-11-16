package com.spring.restaurant.controller;

import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin({"http://localhost:4200","http://localhost:3100"})
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/")
public class OrderController {

    OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    //BASE CRUD
    @GetMapping("allOrders")
    public List<Order> getAllOrders(){
        return orderService.allOrders();
    }

    @GetMapping("category")
    public List<Order> getAllOrdersByCategoryId(@RequestParam Long id){
        return orderService.getOrdersByIdCategories(id);
    }
//    @GetMapping("api/category/{id}")
//    public List<Order> getAllOrdersByCategoryId(@PathVariable Long id){
//        return orderService.getOrdersByIdCategories(id);
//    }
}
