package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// id and name
@Data // getter and setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends CategoryOrder{

    @Column
    private int price;
    @Column
    private String image;

    @Column
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_Category")
    private Category category;
}
