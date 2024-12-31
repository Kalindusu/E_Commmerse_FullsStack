package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private  String phoneNumber;
    private UserRole role;

    private List<OrderItem>orderItemList;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Address address;
    private final LocalDateTime createdAt=LocalDateTime.now();


}
