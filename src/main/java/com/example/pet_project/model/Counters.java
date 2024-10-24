package com.example.pet_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "COUNTERS")
public class Counters {

    @Id
    @Column(name = "counter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long counter_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
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
