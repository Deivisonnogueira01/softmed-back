package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.TestesFarmacologicos;
import com.ifms.softmed.repositories.TestesFarmaRepository;
import com.ifms.softmed.services.TestesFarmaService;

@Service
public class TesteFarmaImpl implements TestesFarmaService{

    @Autowired
    TestesFarmaRepository repository;

    @Override
    public List<TestesFarmacologicos> findAll() {
        return repository.findAll(); 
    }

}