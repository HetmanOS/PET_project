package com.example.pet_project.service;

import com.example.pet_project.model.Clients;

import java.util.List;

public interface ClientsService {

    List<Clients> getAllClients();
    Clients getClientsByClientId(Long client_id);

}