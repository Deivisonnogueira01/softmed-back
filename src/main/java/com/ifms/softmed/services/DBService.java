package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;

@Service
public class DBService {

    @Autowired
    private CasoClinicoRepository repository;


    public void instanciaDb() {

        CasoClinicoModelo caso1 = new CasoClinicoModelo(null,
                1,
                "Joao",
                22,
                1.80,
                90.00,
                "Masculino",
                "Branco",
                "Professor",
                "Católico",
                "Três Lagoas",
                "Andradina",
                "Diabetes do Tipo 1",
                "Perda de Apetite e Falta de Energia",
                "SEM CONTEUDO",
                "HISTORIA PATOLOGICA, AQUI",
                "SOMENTE O PAI POSSUI DIABETES",
                "nao possui");
                caso1.addEspecialidade(Especialidade.CARDIOLOGIA);

        repository.saveAll(Arrays.asList(caso1));
    }
}
