package com.example.pet_project.repository;

import com.example.pet_project.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {

// This interface provides methods for basic CRUD operations on the entity.

}
