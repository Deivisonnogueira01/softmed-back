package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesFisicos;

@Service
public interface ExameFisicoService {
    
    List<ExamesFisicos> findAll();
}
