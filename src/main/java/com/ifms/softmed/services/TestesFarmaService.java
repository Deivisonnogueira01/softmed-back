package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.TestesFarmacologicos;

@Service
public interface TestesFarmaService {
 
    
    List<TestesFarmacologicos> findAll();
}
