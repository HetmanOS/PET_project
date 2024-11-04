package com.example.pet_project.service;

import com.example.pet_project.dto.TotalPaymentDTO;

public interface RateService {

    TotalPaymentDTO calculateTotalPayment(Long client_id);

}