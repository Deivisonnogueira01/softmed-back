package com.ifms.softmed.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.services.CasoClinicoService;

@Service
public class CasoClinicoServiceImpl implements CasoClinicoService {

    @Autowired
    private CasoClinicoRepository repository;

    @Override
    public Optional<CasoClinicoModelo> findAll() {

        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public CasoClinicoModelo findbyId(Integer id) {
        Optional<CasoClinicoModelo> obj = repository.findById(id);
        return obj.orElse(null);
        
    }

}
