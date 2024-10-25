package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "COUNTRY")
public class Country {

    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long country_id;

    @Column(name = "country_of_origin")
    private String country_of_origin;

}