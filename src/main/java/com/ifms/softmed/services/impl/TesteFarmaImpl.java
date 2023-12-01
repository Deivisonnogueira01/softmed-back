package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.domain.model.TestesFarmacologicos;
import com.ifms.softmed.dto.TestesFarmacologicosDTO;
import com.ifms.softmed.repositories.TestesFarmaRepository;
import com.ifms.softmed.services.CasoClinicoService;
import com.ifms.softmed.services.TestesFarmaService;

@Service
public class TesteFarmaImpl implements TestesFarmaService{

    @Autowired
    TestesFarmaRepository repository;

    @Autowired
    CasoClinicoService casoClinicoService;

    @Override
    public List<TestesFarmacologicos> findAll() {
        return repository.findAll(); 
    }

    public List<TestesFarmacologicos> create(List<TestesFarmacologicosDTO> testesDTO, Integer idCasoClinico){

        CasoClinico casoClinico = casoClinicoService.findbyId(idCasoClinico);

        List<TestesFarmacologicos> testesFarmaList = testesDTO.stream()
        .map(testesObjDTO -> {
         TestesFarmacologicos novoExame = new TestesFarmacologicos(testesObjDTO);
         novoExame.setCasot(casoClinico);
         return novoExame;
          
        }).collect(Collectors.toList());
         
        return repository.saveAll(testesFarmaList);

    }

}