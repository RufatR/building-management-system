package com.building.buildingmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    @Column(name = "floors")
    private byte floors;

    @Column(name = "capacity")
    private int capacity;

    @OneToMany(mappedBy = "building")
    private List<Room> rooms;

    @ManyToMany(mappedBy = "buildings")
    private List<Company> companies;


}
