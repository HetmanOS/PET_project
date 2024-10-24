package com.example.pet_project.repository;

import com.example.pet_project.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}