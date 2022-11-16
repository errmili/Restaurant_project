package com.spring.restaurant.dao;
import org.springframework.data.jpa.repository.Query;

import com.spring.restaurant.model.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

    public List<Order> findByCategoryId(Long id);
        // JE METHODE
        //    @Query("SELECT o FROM Order o WHERE o.category.id = :id")
        //    public List<Order> findByCategoryIds(Long id);
}

/*
http://localhost:8080/orders
* */