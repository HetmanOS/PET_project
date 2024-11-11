package com.example.pet_project.service;

public interface CountersService {

    void incrementCounterForClient(Long client_id, String carClassification);
    void decrementCounterForClient(Long client_id, String carClassification);

}