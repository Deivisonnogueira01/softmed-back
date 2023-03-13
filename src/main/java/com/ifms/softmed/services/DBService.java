package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.repositories.CasoClinicoRepository;

@Service
public class DBService {
    

    @Autowired
    private CasoClinicoRepository repository;

   // @Autowired
   // private BCryptPasswordEncoder encoder;

    void instanciaDb(){


        repository.saveAll(Arrays.asList(null));
    }
}
