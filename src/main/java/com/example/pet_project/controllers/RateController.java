package com.example.pet_project.controllers;

import com.example.pet_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/rates")
public class RateController {

    @Autowired
    private RateService rateService;

    @GetMapping("/total/{client_id}")
    public ResponseEntity<Map<String, Map<String, Integer>>> calculateForClient(@PathVariable Long client_id) {
        Map<String, Map<String, Integer>> totalAmount = new HashMap<>();

        totalAmount.put("Daily", rateService.calculateTotalForClient(client_id, "Daily"));
        totalAmount.put("Weekly", rateService.calculateTotalForClient(client_id, "Weekly"));
        totalAmount.put("Monthly", rateService.calculateTotalForClient(client_id, "Monthly"));

        return ResponseEntity.ok(totalAmount);
    }
}