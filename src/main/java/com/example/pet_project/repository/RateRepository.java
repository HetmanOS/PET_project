package com.example.pet_project.repository;

import com.example.pet_project.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}