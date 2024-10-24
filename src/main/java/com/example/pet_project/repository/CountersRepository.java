package com.example.pet_project.repository;

import com.example.pet_project.model.Counters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountersRepository extends JpaRepository<Counters, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}