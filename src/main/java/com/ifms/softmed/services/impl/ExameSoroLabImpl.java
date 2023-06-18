package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesSoroLab;
import com.ifms.softmed.repositories.ExameSoroLabRepository;
import com.ifms.softmed.services.ExameSoroLabService;

@Service
public class ExameSoroLabImpl implements ExameSoroLabService{


    @Autowired
    ExameSoroLabRepository repository;

    @Override
    public List<ExamesSoroLab> findAll() {
       return repository.findAll();
    }
    
}
