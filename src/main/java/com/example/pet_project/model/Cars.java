package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "CARS")
public class Cars {

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "client_id")
    private Clients client_id;

    @Column(name = "status", nullable = false)
    private String status;

    @OneToOne
    @JoinColumn(name = "class_id", nullable = false, referencedColumnName = "class_id")
    private Classification class_id;

    @Column(name = "model_name", nullable = false)
    private String model_name;

    @Column(name = "release_date", nullable = false)
    private Date release_date;

    @OneToOne
    @JoinColumn(name = "fuel_id", nullable = false, referencedColumnName = "fuel_id")
    private Fuel fuel_id;

    @Column(name = "engine_volume", nullable = false)
    private String engine_volume;

    @Column(name = "gear_type", nullable = false)
    private String gear_type;

    @OneToOne
    @JoinColumn(name = "country_id", nullable = false, referencedColumnName = "country_id")
    private Country country_id;

}