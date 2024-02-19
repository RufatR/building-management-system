package com.building.buildingmanagementsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "available")
    private boolean isBlocked;

    @OneToMany(mappedBy = "user")
    private List<Role> roles;


}
