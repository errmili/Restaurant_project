package com.spring.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

// id & name
@Data // getter and setter
@NoArgsConstructor
@Entity
public class Category extends CategoryOrder{

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Order> orders;

}
