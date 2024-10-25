package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "FUEL")
public class Fuel {

    @Id
    @Column(name = "fuel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fuel_id;

    @Column(name = "fuel_type")
    private String fuel_type;

}