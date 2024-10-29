package com.example.pet_project.model;


import jakarta.persistence.*;
import lombok.Data;

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
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email is mandatory and cannot be empty");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain an '@' sybmol along with mail domain");
        }

        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number is mandatory and cannot be empty");
        }

        String digitsOnlyPhone = phone.replaceAll("\\D", "");
        if (digitsOnlyPhone.length() != 12) {
            throw new IllegalArgumentException("Phone number must be exactly 12 digits including the MCC, e.g. +380");
        }

        if (clientType == null) {
            throw new IllegalArgumentException("Client type is mandatory, please chose either 'Residential' or 'Company' type");
        }

        if (clientType != null) {
            if (clientType.getClientType().equals(1L)) {
                if (firstName == null || firstName.trim().isEmpty()) {
                    throw new IllegalArgumentException("First Name is mandatory for Client Type: 'Residential'");
                }
                if (lastName == null || lastName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Last Name is mandatory for Client Type: 'Residential'");
                }
            } else if (clientType.getClientType().equals(2L)) {
                if (companyName == null || companyName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Company Name is mandatory for Client Type: 'Company'");
                }
                if (firstName !=null && !firstName.trim().isEmpty()) {
                    throw new IllegalArgumentException("First Name must be empty for Client Type: 'Company'");
                }
                if (lastName !=null && !lastName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Last Name must be empty for Client Type: 'Company'");
                }
            }
        } else {
            throw new IllegalArgumentException("Cline Type is Mandatory option");
        }
    }

}