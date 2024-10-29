package com.example.pet_project.repository;

import com.example.pet_project.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarsRepository extends JpaRepository<Cars, Long> {

    @Query(
            value = "SELECT * FROM CARS WHERE customer_id = :customer_id",
            nativeQuery = true
    )
    List<Cars> findByCustomerId(@Param("customer_id") Long customer_id);

    @Query(
            value = "SELECT * FROM CARS WHERE status='Available' AND class_id = :class_id",
            nativeQuery = true
    )
    List<Cars> findAllAvailableCarsByClassId(@Param("class_id") Long class_id);

}