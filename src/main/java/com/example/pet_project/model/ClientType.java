package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CLIENT_TYPE")
public class ClientType {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientType;

    @Column(name = "type")
    private String type;

}