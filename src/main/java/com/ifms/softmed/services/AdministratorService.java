package com.ifms.softmed.services;

import java.util.List;

import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.dto.AdministratorDTO;

public interface AdministratorService {

    List<Administrator> findAll();

    // Administrator findById(Integer id);

    public Administrator create(AdministratorDTO objDTO);
}
