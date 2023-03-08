package com.ifms.softmed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.softmed.domain.model.CasoClinicoModelo;

@Repository
public interface CasoClinicoRepository extends JpaRepository<CasoClinicoModelo, Integer>{
    
   

    
}
