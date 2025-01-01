package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = 'products')
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private  String name;
    private  String description;
    private  String imageUrl;

    private  Category category;
    @Column(name = "created_at")
    private final LocalDateTime createdAt=LocalDateTime.now();
}
