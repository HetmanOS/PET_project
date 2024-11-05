package com.example.pet_project.service;

import java.util.Map;

public interface RateService {

    Map<String, Integer> calculateTotalForClient(Long client_id, String rateType);

}