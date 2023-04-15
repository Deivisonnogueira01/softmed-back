package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.dto.CasoClinicoDTO;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.services.CasoClinicoService;

@Service
public class CasoClinicoServiceImpl implements CasoClinicoService {

    @Autowired
    private CasoClinicoRepository repository;

    @Override
    public List<CasoClinicoModelo> findAll() {

       return repository.findAll();
    }

    @Override
    public CasoClinicoModelo findbyId(Integer id) {
        Optional<CasoClinicoModelo> obj = repository.findById(id);
        return obj.orElse(null);
        
    }

    @Override
    public List<CasoClinicoModelo> findByEspecialidade(Especialidade especialidade) {
        return repository.findByEspecialidade(especialidade);
    }

    @Override
    public CasoClinicoModelo create(CasoClinicoDTO casoClinicoDTO) {
        
        casoClinicoDTO.setCasoClinicoId(null);
        CasoClinicoModelo newObj = new CasoClinicoModelo(casoClinicoDTO);
       return repository.save(newObj);
    }

  
}
