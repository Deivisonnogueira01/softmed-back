package com.ifms.softmed.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;

public class CasoClinicoService {
    @Autowired
    private CasoClinicoRepository repository;

  /*   public List<CasoClinicoModelo> findAll(){
        return repository.findAll();
    }
*/
    

}
