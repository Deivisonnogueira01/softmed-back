package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.ExamesImagem;

@Service
public interface ExameImagemService {
    
    List<ExamesImagem> findAll();
}
