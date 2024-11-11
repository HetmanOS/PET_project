package com.example.pet_project.model.validator;

import com.example.pet_project.model.Clients;
import com.example.pet_project.model.ClientType;

public class ClientsValidator {

    public static void validateClient(Clients client) {
        if (client.getEmail() == null || client.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("Email is mandatory and cannot be empty");
        }

        if (!client.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email must contain an '@' symbol along with a mail domain");
        }

        if (client.getPhone() == null || client.getPhone().trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number is mandatory and cannot be empty");
        }

        String digitsOnlyPhone = client.getPhone().replaceAll("\\D", "");
        if (digitsOnlyPhone.length() != 12) {
            throw new IllegalArgumentException("phone number must be exactly 12 digits including MCC (mobile country code), e.g. +380");
        }

        if (client.getClientType() == null) {
            throw new IllegalArgumentException("Client type is mandatory, please choose either 'Residential' or 'Company' type");
        }

        validateClientTypeSpecificationFields(client);
    }

        private static void validateClientTypeSpecificationFields(Clients client) {
            ClientType clientType = client.getClientType();

            if (clientType.getClientType().equals(1L)) {
                if (client.getFirstName() == null || client.getFirstName().trim().isEmpty()) {
                    throw new IllegalArgumentException("First Name is mandatory for Client Type: 'Residential'");
                }

                if (client.getLastName() == null || client.getLastName().trim().isEmpty()) {
                    throw new IllegalArgumentException("Last Name is mandatory for Client Type: 'Residential'");
                }

            } else if (clientType.getClientType().equals(2L)) {
                if (client.getCompanyName() == null || client.getCompanyName().trim().isEmpty()) {
                    throw new IllegalArgumentException("Company Name is mandatory for Client Type: 'Company'");
                }

                if (client.getFirstName() != null && !client.getFirstName().trim().isEmpty()) {
                    throw new IllegalArgumentException("First Name must be empty for Client Type: 'Company'");
                }

                if (client.getLastName() != null && !client.getLastName().trim().isEmpty()) {
                    throw new IllegalArgumentException("Last Name must be empty for Client Type: 'Company'");
                }

            }

        }

}