package com.example.pet_project.repository;

import com.example.pet_project.model.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}
