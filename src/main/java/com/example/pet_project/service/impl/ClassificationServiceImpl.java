package com.example.pet_project.service.impl;

import com.example.pet_project.model.Classification;
import com.example.pet_project.repository.ClassificationRepository;
import com.example.pet_project.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImpl implements ClassificationService {

    @Autowired
    private ClassificationRepository classificationRepository;

    @Override
    public List<Classification> getAllClassifications() {
        return classificationRepository.findAll();
    }

}
