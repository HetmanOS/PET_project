package com.example.pet_project.model;


import jakarta.persistence.*;
import lombok.Data;
import com.example.pet_project.model.validator.ClientsValidator;

@Entity
@Data
@Table(name = "CLIENTS")
public class Clients {

    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "client_type_id", nullable = false,  referencedColumnName = "id")
    private ClientType clientType;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "company_name")
    private String companyName;

    @PrePersist
    private void validate() {
        ClientsValidator.validateClient(this);
    }

}