package com.example.pet_project.controllers;

import com.example.pet_project.model.Cars;
import com.example.pet_project.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping
    public List<Cars> getAllCars() {
        return carsService.getAllCars();
    }

    @GetMapping("/car/{car_id}")
    public ResponseEntity<Cars> getCarByCarId(@PathVariable("car_id") Long car_id) {
        return new ResponseEntity<Cars>(carsService.getCarByCarId(car_id), HttpStatus.OK);
    }

    @GetMapping("/customer/{customer_id}")
    public ResponseEntity<List<Cars>> getCarsByCustomerId(@PathVariable("customer_id") Long customer_id) {
        return new ResponseEntity<List<Cars>>(carsService.getCarsByCustomerId(customer_id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cars> saveCar(@RequestBody Cars car) {
        return new ResponseEntity<Cars>(carsService.saveCar(car), HttpStatus.CREATED);
    }

}