package com.example.pet_project.service;

import com.example.pet_project.model.Cars;

import java.util.List;

public interface CarsService {

    List<Cars> getAllCars();
    Cars getCarByCarId(Long car_id);
    List<Cars> getCarsByCustomerId(Long customer_id);
    List<Cars> getAvailableCarsByClassId(Long class_id);
    Cars saveCar(Cars car_id);
    Cars assignCarToClient(Long car_id, Long client_id);
    Cars deassignCarFromClient(Long car_id, Long client_id);

}