package com.building.buildingmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "floor")
    private byte floor;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "room_price")

    private int roomPrice;

    @Column(name = "start_date")
    private LocalDate startDate;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    @Column(name = "available")
    private boolean isActive;

    @Column(name = "paying_type")
    private String payingType;

    @Column(name = "pay_date")
    private LocalDate payDate;


}
