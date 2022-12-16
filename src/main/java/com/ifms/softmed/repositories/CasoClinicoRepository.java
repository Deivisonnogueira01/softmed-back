package com.ifms.softmed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifms.softmed.domain.model.CasoClinicoModelo;

public interface CasoClinicoRepository extends JpaRepository<CasoClinicoModelo, Integer>{
    
   
}
