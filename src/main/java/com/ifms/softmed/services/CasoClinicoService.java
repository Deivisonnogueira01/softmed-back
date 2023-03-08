package com.ifms.softmed.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinicoModelo;

@Service
public interface CasoClinicoService {

   
    Optional<CasoClinicoModelo> findAll();
  
/*Criar uma DTO para se Comunicar com o Banco */
/* E criar uma implementacao da interface do service para chamar os metodos */

}
    


