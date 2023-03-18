package com.ifms.softmed.services;

import java.util.Optional;

import com.ifms.softmed.domain.model.CasoClinicoModelo;


public interface CasoClinicoService {

   
    Optional<CasoClinicoModelo> findAll();

    CasoClinicoModelo findbyId(Integer id);

  
/*Criar uma DTO para se Comunicar com o Banco */
/* E criar uma implementacao da interface do service para chamar os metodos */

}
    


