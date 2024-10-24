package com.example.pet_project.repository;

import com.example.pet_project.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}