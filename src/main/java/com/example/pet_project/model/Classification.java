package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CLASSIFICATION")
public class Classification {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;

    @Column(name = "description")
    private String description;

}