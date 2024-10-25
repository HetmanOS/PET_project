package com.example.pet_project.service.impl;

import com.example.pet_project.model.Cars;
import com.example.pet_project.repository.CarsRepository;
import com.example.pet_project.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsServiceImpl implements CarsService {

    @Autowired
    private CarsRepository carsRepository;

    @Override
    public List<Cars> getAllCars() {
        return carsRepository.findAll();
    }

    @Override
    public Cars getCarByCarId(Long car_id) {
        Optional<Cars> car = carsRepository.findById(car_id);
        if (car.isPresent()) {
            return car.get();
        } else {
            throw new RuntimeException("No Car Has Been Found");
        }
    }

    /*@Override
    public Cars getCarsByCustomerId(Long customer_id) {
        Optional<Cars> cars = carsRepository.find(customer_id);
        if (cars.isPresent()) {
            return cars.get();
        } else {
            throw new RuntimeException("No Cars for that Customer");
        }
    }*/

    @Override
    public List<Cars> getCarsByCustomerId(Long customer_id) {
        List<Cars> cars = carsRepository.findByCustomerId(customer_id);
        if (!cars.isEmpty()) {
            return cars;
        } else {
            throw new RuntimeException("No Cars for that Customer");
        }
    }

    @Override
    public Cars saveCar(Cars car) {
        return carsRepository.save(car);
    }

}