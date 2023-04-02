package com.ifms.softmed.services;

import java.util.List;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;


public interface CasoClinicoService {

   
    List<CasoClinicoModelo> findAll();

    CasoClinicoModelo findbyId(Integer id);

   // CasoClinicoModelo findByEspecialidade(Especialidade especialidade);


}
    


