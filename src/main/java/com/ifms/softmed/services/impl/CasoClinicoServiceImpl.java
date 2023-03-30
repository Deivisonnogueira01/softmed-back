package com.ifms.softmed.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
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

   /*  @Override
    public CasoClinicoModelo findByEspecialidade(Especialidade especialidade) {

        Optional<CasoClinicoModelo> obj = repository.findByEspecialidade(especialidade);
        return obj.orElse(null);

    }*/

}
