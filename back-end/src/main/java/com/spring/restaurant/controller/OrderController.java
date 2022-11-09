package com.spring.restaurant.controller;

import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    OrderService orderService;


    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    //BASE CRUD
    @GetMapping("api/allOrders")
    public List<Order> getAllOrders(){
        return orderService.allOrders();
    }

}
