package com.example.pet_project.repository;

import com.example.pet_project.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Long> {

    @Query("SELECT c FROM Cars c WHERE c.client_id.client_id = :customer_id")
    List<Cars> findByCustomerId(@Param("customer_id") Long customer_id);

}