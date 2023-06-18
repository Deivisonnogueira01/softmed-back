package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesSoroLab;

@Service
public interface ExameSoroLabService {
    
    List<ExamesSoroLab> findAll();
}
