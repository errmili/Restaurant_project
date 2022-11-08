package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

// id & name
@Data // getter and setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends CategoryOrder{
    private Long id;
}
