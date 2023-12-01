package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.domain.model.ExamesFisicos;
import com.ifms.softmed.dto.ExameFisicosDTO;
import com.ifms.softmed.repositories.ExameFisicoRepository;
import com.ifms.softmed.services.CasoClinicoService;
import com.ifms.softmed.services.ExameFisicoService;

@Service
public class ExameFisicoImpl implements ExameFisicoService {


    @Autowired
    ExameFisicoRepository repository;

     @Autowired
    CasoClinicoService casoClinicoService;

    @Override
    public List<ExamesFisicos> findAll() {
       return repository.findAll();
    }
    
    public List<ExamesFisicos> create(List<ExameFisicosDTO> exameFisicosDTOs, Integer idCaso){

       CasoClinico casoClinico = casoClinicoService.findbyId(idCaso);

       List<ExamesFisicos> examesFisicos = exameFisicosDTOs.stream()
       .map(exameFisicosDTO -> {
         ExamesFisicos nFisicos = new ExamesFisicos(exameFisicosDTO);
         nFisicos.setCasof(casoClinico);
         return nFisicos;
       }).collect(Collectors.toList());

       return repository.saveAll(examesFisicos);

    }

}
