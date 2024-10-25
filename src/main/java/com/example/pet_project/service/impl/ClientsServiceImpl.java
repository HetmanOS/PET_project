package com.example.pet_project.service.impl;

import com.example.pet_project.model.Clients;
import com.example.pet_project.repository.ClientsRepository;
import com.example.pet_project.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    @Override
    public List<Clients> getAllClients() {
        return clientsRepository.findAll();
    }

    @Override
    public Clients getClientByClientId(Long client_id) {
        Optional<Clients> client = clientsRepository.findById(client_id);
        if (client.isPresent()) {
            return client.get();
        } else {
            throw new RuntimeException("No Client Has Been Found");
        }
    }

    @Override
    public Clients saveClient(Clients client) {
        return clientsRepository.save(client);
    }

}