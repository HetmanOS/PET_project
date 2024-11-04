package com.example.pet_project.service.impl;

import com.example.pet_project.dto.TotalPaymentDTO;
import com.example.pet_project.model.Counters;
import com.example.pet_project.model.Rate;
import com.example.pet_project.repository.CountersRepository;
import com.example.pet_project.repository.RateRepository;
import com.example.pet_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private CountersRepository countersRepository;
    @Autowired
    private RateRepository rateRepository;

    @Override
    public TotalPaymentDTO calculateTotalPayment(Long client_id) {
        Counters counters = countersRepository.findByClientId(client_id);

        if (counters == null) {
            throw new RuntimeException("No counters found for client ID: " + client_id);
        }

        double dailyTotal = calculateForRateType(counters, "Daily");
        double weeklyTotal = calculateForRateType(counters, "Weekly");
        double monthlyTotal = calculateForRateType(counters, "Monthly");

        return new TotalPaymentDTO(dailyTotal, weeklyTotal, monthlyTotal);
    }

    private double calculateForRateType(Counters counters, String rateType) {
        double total = 0.0;

        if (counters.getEconomy_num() > 0) {
            total += calculateForClassAndRateType(1L, counters.getEconomy_num(), rateType);
        }

        if (counters.getMiddle_num() > 0) {
            total += calculateForClassAndRateType(2L, counters.getMiddle_num(), rateType);
        }

        if (counters.getBusiness_num() > 0) {
            total += calculateForClassAndRateType(3L, counters.getBusiness_num(), rateType);
        }

        if (counters.getPremium_num() > 0) {
            total += calculateForClassAndRateType(4L, counters.getPremium_num(), rateType);
        }

        if (counters.getSuv_num() > 0) {
            total += calculateForClassAndRateType(5L, counters.getSuv_num(), rateType);
        }

        if (counters.getMinivans_num() > 0) {
            total += calculateForClassAndRateType(6L, counters.getMinivans_num(), rateType);
        }

        if (counters.getElectro_hybrid_num() > 0) {
            total += calculateForClassAndRateType(7L, counters.getElectro_hybrid_num(), rateType);
        }

        return total;
    }

    private double calculateForClassAndRateType(Long classId, int numCars, String rateType) {
        Rate rate = rateRepository.findByClassIdAndName(classId, rateType);

        if (rate == null) {
            throw new RuntimeException("Rate not found for class ID: " + classId + " and rate type: " + rateType);
        }

        double price = rate.getPrice();
        double percentage = rate.getPercentage() / 100.0;
        return numCars * price * percentage;
    }

}