package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;


@Service
public interface CasoClinicoService {

   
    List<CasoClinicoModelo> findAll();

    CasoClinicoModelo findbyId(Integer id);

   // CasoClinicoModelo findByEspecialidade(Especialidade especialidade);


}
    


