package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.dto.AdministratorDTO;
import com.ifms.softmed.repositories.AdministratorRepository;
import com.ifms.softmed.services.AdministratorService;

@Service
public class AdministratorServiceImpl implements AdministratorService{
    

    @Autowired
    private AdministratorRepository repository;

    @Autowired
	private BCryptPasswordEncoder encoder;

    @Override
    public List<Administrator> findAll() {

       return repository.findAll();
       
    }

    public Administrator create(AdministratorDTO objDTO) {
		objDTO.setId(null);
		objDTO.setSenha(encoder.encode(objDTO.getSenha()));
		
		Administrator newObj = new Administrator(objDTO);
		return repository.save(newObj);
	}



  

}
