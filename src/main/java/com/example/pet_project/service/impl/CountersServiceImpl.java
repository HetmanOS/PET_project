package com.example.pet_project.service.impl;

import com.example.pet_project.model.Clients;
import com.example.pet_project.model.Counters;
import com.example.pet_project.repository.ClientsRepository;
import com.example.pet_project.repository.CountersRepository;
import com.example.pet_project.service.CountersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountersServiceImpl implements CountersService {

    @Autowired
    private CountersRepository countersRepository;
    @Autowired
    private ClientsRepository clientsRepository;

    @Override
    public void incrementCounterForClient(Long client_id, String carClassification) {
        Counters counters = countersRepository.findByClientId(client_id);

        if (counters == null) {
            counters = new Counters();
            Clients client = clientsRepository.findById(client_id)
                    .orElseThrow(() -> new RuntimeException("Client not found with ID: " + client_id));
            counters.setClient_id(client);
            initializeCounters(counters, carClassification);
            countersRepository.save(counters);
        } else {
            switch (carClassification.toLowerCase()) {
                case "economy":
                    counters.setEconomy_num(counters.getEconomy_num() == null ? 1 : counters.getEconomy_num() + 1);
                    break;
                case "middle":
                    counters.setMiddle_num(counters.getMiddle_num() == null ? 1 : counters.getMiddle_num() + 1);
                    break;
                case "business":
                    counters.setBusiness_num(counters.getBusiness_num() == null ? 1 : counters.getBusiness_num() + 1);
                    break;
                case "premium":
                    counters.setPremium_num(counters.getPremium_num() == null ? 1 : counters.getPremium_num() + 1);
                    break;
                case "suv":
                    counters.setSuv_num(counters.getSuv_num() == null ? 1 : counters.getSuv_num() + 1);
                    break;
                case "minivans":
                    counters.setMinivans_num(counters.getMinivans_num() == null ? 1 : counters.getMinivans_num() + 1);
                    break;
                case "electro_hybrid":
                    counters.setElectro_hybrid_num(counters.getElectro_hybrid_num() == null ? 1 : counters.getElectro_hybrid_num() + 1);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown car classification: " + carClassification);
            }
            countersRepository.save(counters);
        }
    }

    private void initializeCounters(Counters counters, String carClassification) {
        switch (carClassification) {
            case "Economy":
                counters.setEconomy_num(1);
                break;
            case "Middle":
                counters.setMiddle_num(1);
                break;
            case "Business":
                counters.setBusiness_num(1);
                break;
            case "Premium":
                counters.setPremium_num(1);
                break;
            case "SUV":
                counters.setSuv_num(1);
                break;
            case "Minivans":
                counters.setMinivans_num(1);
                break;
            case "Electro_Hybrid":
                counters.setElectro_hybrid_num(1);
                break;
            default:
                throw new IllegalArgumentException("Unknown car classification: " + carClassification);
        }
    }

    @Override
    public void decrementCounterForClient(Long client_id, String carClassification) {
        Counters counters = countersRepository.findByClientId(client_id);

        if (counters == null) {
            throw new RuntimeException("No counters found for client with ID: " + client_id);
        }

        switch (carClassification.toLowerCase()) {
            case "economy":
                counters.setEconomy_num(Math.max(0, counters.getEconomy_num() - 1));
                break;
            case "middle":
                counters.setMiddle_num(Math.max(0, counters.getMiddle_num() - 1));
                break;
            case "business":
                counters.setBusiness_num(Math.max(0, counters.getBusiness_num() - 1));
                break;
            case "premium":
                counters.setPremium_num(Math.max(0, counters.getPremium_num() -1 ));
                break;
            case "suv":
                counters.setSuv_num(Math.max(0, counters.getSuv_num() -1 ));
                break;
            case "minivans":
                counters.setMinivans_num(Math.max(0, counters.getMinivans_num() -1 ));
                break;
            case "electro_hybrid":
                counters.setElectro_hybrid_num(Math.max(0, counters.getElectro_hybrid_num() -1 ));
                break;
            default:
                throw new IllegalArgumentException("Unknown car classification: " + carClassification);
        }

        countersRepository.save(counters);

    }

}