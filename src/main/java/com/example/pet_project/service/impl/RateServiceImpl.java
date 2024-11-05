package com.example.pet_project.service.impl;

import com.example.pet_project.model.Cars;
import com.example.pet_project.model.Classification;
import com.example.pet_project.model.Rate;
import com.example.pet_project.repository.CarsRepository;
import com.example.pet_project.repository.RateRepository;
import com.example.pet_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;
    @Autowired
    private CarsRepository carsRepository;

    @Override
    public Integer calculateTotalForClient(Long client_id, String rateType) {
        int total = 0;
        List<Cars> cars = carsRepository.findByCustomerId(client_id);

        for (Cars car : cars) {
            Classification classification = car.getClass_id();
            Rate rate = rateRepository.findByClassIdAndName(classification.getClass_id(), rateType);
            if (rate != null) {
                total += rate.getPrice();
            }
        }
        return total;
    }
}