package com.example.pet_project.repository;

import com.example.pet_project.model.Counters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountersRepository extends JpaRepository<Counters, Long> {

    @Query(
            value = "SELECT * FROM COUNTERS WHERE client_id = :client_id",
            nativeQuery = true
    )
    Counters findByClientId(@Param("client_id") Long client_id);

}