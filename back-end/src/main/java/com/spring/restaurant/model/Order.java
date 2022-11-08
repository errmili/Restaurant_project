package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// id and name
@Data // getter and setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderfood")
public class Order extends CategoryOrder{

    @Column
    private int price;
    @Column
    private String img;
    @Column
    private String description;
}
