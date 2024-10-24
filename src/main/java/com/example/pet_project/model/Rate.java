package com.example.pet_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "RATE")
public class Rate {

    @Id
    @Column(name = "rate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rate_id;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classification class_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "percentage", nullable = false)
    private Integer percentage;

}