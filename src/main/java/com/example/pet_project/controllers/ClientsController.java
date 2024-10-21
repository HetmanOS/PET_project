package com.example.pet_project.controllers;

import com.example.pet_project.model.Clients;
import com.example.pet_project.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientsController {

    @Autowired
    private ClientsService clientsService;

    @GetMapping
    public List<Clients> getAllClients() {
        return clientsService.getAllClients();
    }

    @GetMapping("{client_id}")
    public ResponseEntity<Clients> getClientsByClientId(@PathVariable("client_id") Long clientId) {
        return new ResponseEntity<Clients>(clientsService.getClientsByClientId(clientId), HttpStatus.OK);
    }

}