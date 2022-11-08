package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.util.Date;

// id & name
@Data // getter and setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity{
    private String name;

    @Column(name = "date_create")
    @CreationTimestamp
    private Date datecreate;

    @Column(name = "date_update")
    private Date dateupdate;
}
