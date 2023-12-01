package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.domain.model.ExamesFisicos;
import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.domain.model.ExamesSoroLab;
import com.ifms.softmed.domain.model.TestesFarmacologicos;
import com.ifms.softmed.dto.CasoClinicoDTO;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.services.CasoClinicoService;

@Service
public class CasoClinicoServiceImpl implements CasoClinicoService {

    @Autowired
    private CasoClinicoRepository repository;

    @Override
    public List<CasoClinico> findAll() {

       return repository.findAll();
    }

    @Override
    public CasoClinico findbyId(Integer id) {
        Optional<CasoClinico> obj = repository.findById(id);
        return obj.orElse(null);
        
    }

    @Override
    public List<CasoClinico> findByEspecialidade(Especialidade especialidade) {
        return repository.findByEspecialidade(especialidade);
    }

    @Override
    public CasoClinico create(CasoClinicoDTO casoClinicoDTO) {
        
        casoClinicoDTO.setCasoClinicoId(null);
        CasoClinico novoCasoClinico = new CasoClinico(casoClinicoDTO);

        // Associa os exames de imagem ao caso clínico usando o ID do caso clínico
        if (casoClinicoDTO.getExamesImagem() != null) {
            List<ExamesImagem> examesImagemAssociados = casoClinicoDTO.getExamesImagem()
                    .stream()
                    .map(exameDTO -> new ExamesImagem(exameDTO))
                    .collect(Collectors.toList());
            
            novoCasoClinico.setExamesImagem(examesImagemAssociados);
        }

        if(casoClinicoDTO.getExamesFisicos() != null){
            List<ExamesFisicos> examesFisicosAssociados = casoClinicoDTO.getExamesFisicos()
            .stream()
            .map(exameDTO -> new ExamesFisicos(exameDTO))
            .collect(Collectors.toList());
            novoCasoClinico.setExamesFisicos(examesFisicosAssociados);
        }

        if(casoClinicoDTO.getExamesSoroLab() != null){
            List<ExamesSoroLab> examesFisicosAssociados = casoClinicoDTO.getExamesSoroLab()
            .stream()
            .map(exameDTO -> new ExamesSoroLab(exameDTO))
            .collect(Collectors.toList());
            novoCasoClinico.setExamesSoroLab(examesFisicosAssociados);
        }


        if(casoClinicoDTO.getExamesTestesFarma() != null){
            List<TestesFarmacologicos> examesFisicosAssociados = casoClinicoDTO.getExamesTestesFarma()
            .stream()
            .map(exameDTO -> new TestesFarmacologicos(exameDTO))
            .collect(Collectors.toList());
            novoCasoClinico.setExamesTesteFarma(examesFisicosAssociados);
        }

        // Pode adicionar lógica semelhante para outros tipos de exames, se necessário

        // Atualiza o caso clínico com as associações de exames
        

        return repository.save(novoCasoClinico);
    }

}

  

