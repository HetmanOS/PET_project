package com.example.pet_project.repository;

import com.example.pet_project.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients,Long> {

// This interface provides methods for basic CRUD operations on the entity.

}
