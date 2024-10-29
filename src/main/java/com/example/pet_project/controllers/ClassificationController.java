package com.example.pet_project.controllers;

import com.example.pet_project.model.Classification;
import com.example.pet_project.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/classifications")
public class ClassificationController {

    @Autowired
    private ClassificationService classificationService;

    @GetMapping
    public List<Classification> getAllClassifications() {
        return classificationService.getAllClassifications();
    }

}