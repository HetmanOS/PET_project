package com.example.pet_project.service.impl;

import com.example.pet_project.model.Cars;
import com.example.pet_project.model.Classification;
import com.example.pet_project.model.Rate;
import com.example.pet_project.repository.CarsRepository;
import com.example.pet_project.repository.RateRepository;
import com.example.pet_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;
    @Autowired
    private CarsRepository carsRepository;

    @Override
    public Map<String, Integer> calculateTotalForClient(Long client_id, String rateType) {
        int total = 0;
        int mortgage = 0;

        List<Cars> cars = carsRepository.findByCustomerId(client_id);

        for (Cars car : cars) {
            Classification classification = car.getClass_id();
            Rate rate = rateRepository.findByClassIdAndName(classification.getClass_id(), rateType);
            if (rate != null) {
                total += rate.getPrice();
                mortgage += rate.getPrice() * rate.getPercentage() / 100;
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("total", total);
        result.put("mortgage", mortgage);
        return result;
    }
}