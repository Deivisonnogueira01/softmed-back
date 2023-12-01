package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.dto.ExamesImagemDTO;
import com.ifms.softmed.repositories.ExameImagemRepository;
import com.ifms.softmed.services.CasoClinicoService;
import com.ifms.softmed.services.ExameImagemService;

@Service
public class ExameImagemImpl implements ExameImagemService {

    @Autowired
    ExameImagemRepository repository;

    @Autowired
    CasoClinicoService casoClinicoService;

    @Override
    public List<ExamesImagem> findAll() {
         return repository.findAll();
    }
    
    public List<ExamesImagem> create(List<ExamesImagemDTO> examesImagemDTOs, Integer idCasoClinico) {
        // Recupera o caso clínico existente pelo ID
        
        CasoClinico casoClinico = casoClinicoService.findbyId(idCasoClinico);

        // Cria os exames de imagem relacionados ao caso clínico
        List<ExamesImagem> examesImagemList = examesImagemDTOs.stream()
                .map(examesImagemDTO -> {
                    ExamesImagem novoExame = new ExamesImagem(examesImagemDTO);
                    novoExame.setCasoi(casoClinico);
                    return novoExame;
                })
                .collect(Collectors.toList());

        // Salva os exames de imagem no banco de dados
        return repository.saveAll(examesImagemList);
    }
}


