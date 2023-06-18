package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesFisicos;
import com.ifms.softmed.repositories.ExameFisicoRepository;
import com.ifms.softmed.services.ExameFisicoService;

@Service
public class ExameFisicoImpl implements ExameFisicoService {


    @Autowired
    ExameFisicoRepository repository;

    @Override
    public List<ExamesFisicos> findAll() {
       return repository.findAll();
    }
    
}
