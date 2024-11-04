package com.example.pet_project.repository;

import com.example.pet_project.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RateRepository extends JpaRepository<Rate, Long> {

    @Query("SELECT r FROM Rate r WHERE r.class_id.class_id = :classId AND r.name = :rateType")
    Rate findByClassIdAndName(@Param("classId") Long classId, @Param("rateType") String rateType);

}