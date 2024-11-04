package com.example.pet_project.controllers;


import com.example.pet_project.dto.TotalPaymentDTO;
import com.example.pet_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rates")
public class RateController {

    @Autowired
    private RateService rateService;

    @GetMapping("/total/{client_id}")
    public ResponseEntity<TotalPaymentDTO> getTotalPayment(@PathVariable("client_id") Long client_id) {
        try {
            TotalPaymentDTO totalPayment = rateService.calculateTotalPayment(client_id);
            return new ResponseEntity<TotalPaymentDTO>(totalPayment, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<TotalPaymentDTO>(HttpStatus.NOT_FOUND); //Client not found or rate type is not available
        }
    }

}