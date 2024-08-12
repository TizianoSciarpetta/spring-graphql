package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Column(name = "PAGECOUNT")
    private int pageCount;

    @ManyToOne
    private Author author;

}
