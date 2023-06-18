package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.repositories.ExameImagemRepository;
import com.ifms.softmed.services.ExameImagemService;

@Service
public class ExameImagemImpl implements ExameImagemService {

    @Autowired
    ExameImagemRepository repository;

    @Override
    public List<ExamesImagem> findAll() {
         return repository.findAll();
    }
    
}
