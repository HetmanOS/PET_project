package com.example.pet_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "COUNTERS")
public class Counters {

    @Id
    @Column(name = "counter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long counter_id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, referencedColumnName = "client_id")
    private Clients client_id;

    @Column(name = "economy_num")
    private Integer economy_num;

    @Column(name = "middle_num")
    private Integer middle_num;

    @Column(name = "business_num")
    private Integer business_num;

    @Column(name = "premium_num")
    private Integer premium_num;

    @Column(name = "suv_num")
    private Integer suv_num;

    @Column(name = "minivans_num")
    private Integer minivans_num;

    @Column(name = "electro_hybrid_num")
    private Integer electro_hybrid_num;

}