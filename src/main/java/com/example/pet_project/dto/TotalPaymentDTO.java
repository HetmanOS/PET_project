package com.example.pet_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TotalPaymentDTO {

    private double dailyTotal;
    private double weeklyTotal;
    private double monthlyTotal;

}