package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinico;
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
        CasoClinico newObj = new CasoClinico(casoClinicoDTO);
       return repository.save(newObj);
    }

  
}
