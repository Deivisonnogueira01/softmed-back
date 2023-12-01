package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.domain.model.ExamesSoroLab;
import com.ifms.softmed.dto.ExamesSoroLabDTO;
import com.ifms.softmed.repositories.ExameSoroLabRepository;
import com.ifms.softmed.services.CasoClinicoService;
import com.ifms.softmed.services.ExameSoroLabService;

@Service
public class ExameSoroLabImpl implements ExameSoroLabService{


    @Autowired
    ExameSoroLabRepository repository;

    @Autowired
    CasoClinicoService casoClinicoService;

    @Override
    public List<ExamesSoroLab> findAll() {
       return repository.findAll();
    }

    public List<ExamesSoroLab> create(List<ExamesSoroLabDTO> examesSoroLabDTO, Integer idCasoClinico) {
        // Recupera o caso clínico existente pelo ID
        
        CasoClinico casoClinico = casoClinicoService.findbyId(idCasoClinico);

    
        List<ExamesSoroLab> examesSoroLabs = examesSoroLabDTO.stream()
                .map(exameSoroLabDTO -> {
                    ExamesSoroLab novoExame = new ExamesSoroLab(exameSoroLabDTO);
                    novoExame.setCaso(casoClinico);
                    return novoExame;
                })
                .collect(Collectors.toList());

        return repository.saveAll(examesSoroLabs);
    }
    
}
