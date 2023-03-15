package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;

@Service
public class DBService {

    @Autowired
    private CasoClinicoRepository repository;

    // @Autowired
    // private BCryptPasswordEncoder encoder;

    public void instanciaDb() {

        // CasoClinicoModelo caso1 = new CasoClinicoModelo(null, 1);

        repository.saveAll(Arrays.asList(null));
    }
}
