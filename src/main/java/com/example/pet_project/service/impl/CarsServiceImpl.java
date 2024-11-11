package com.example.pet_project.service.impl;

import com.example.pet_project.model.Cars;
import com.example.pet_project.model.Clients;
import com.example.pet_project.repository.CarsRepository;
import com.example.pet_project.repository.ClientsRepository;
import com.example.pet_project.service.CarsService;
import com.example.pet_project.service.CountersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsServiceImpl implements CarsService {

    @Autowired
    private CarsRepository carsRepository;
    @Autowired
    private ClientsRepository clientsRepository;
    @Autowired
    private CountersService countersService;

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
    public List<Cars> getAvailableCarsByClassId(Long class_id) {
        List<Cars> cars = carsRepository.findAllAvailableCarsByClassId(class_id);
        if (!cars.isEmpty()) {
            return cars;
        } else {
            throw new RuntimeException("No Cars are 'Available' now in that Class");
        }
    }

    @Override
    public Cars saveCar(Cars car) {
        return carsRepository.save(car);
    }

    @Override
    public Cars assignCarToClient(Long car_id, Long client_id) {
        Cars car = carsRepository.findById(car_id)
                .orElseThrow(() -> new RuntimeException("Car not found with ID: " + car_id));
        Clients client = clientsRepository.findById(client_id)
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + client_id));

        List<Cars> availableCars = getAvailableCarsByClassId(car.getClass_id().getClass_id());

        boolean isCarAvailable = availableCars.stream().anyMatch(availableCar -> availableCar.getCar_id().equals(car_id));
        if(!isCarAvailable) {
            throw new IllegalStateException("Car Id with ID '" + car_id + "' is 'Not Available' for assignment");
        }

        car.setClient_id(client);
        car.setStatus("Not Available");

        String carClassification = car.getClass_id().getDescription();
        countersService.incrementCounterForClient(client_id, carClassification);

        return carsRepository.save(car);
    }

    @Override
    public Cars deassignCarFromClient(Long car_id, Long client_id) {
        Cars car = carsRepository.findById(car_id)
                .orElseThrow(() -> new RuntimeException("Car not found with ID: " + car_id));
        Clients client = clientsRepository.findById(client_id)
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + client_id));
        if (car.getClient_id() == null || !car.getClient_id().getClient_id().equals(client_id)) {
            throw new IllegalStateException("Car " + car_id + " is not assigned to the client with ID: " + client_id);
        }

        car.setClient_id(null);
        car.setStatus("Available");

        String carClassification = car.getClass_id().getDescription();
        countersService.decrementCounterForClient(client_id, carClassification);

        return carsRepository.save(car);
    }

}