package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;

@Service
public class DBService {

    @Autowired
    private CasoClinicoRepository repository;


    public void instanciaDb() {

         CasoClinicoModelo caso1 = new CasoClinicoModelo(1,
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

                CasoClinicoModelo caso2 = new CasoClinicoModelo(2,
                2,
                "Euler",
                24,
                1.78,
                70.00,
                "Masculino",
                "Pardo",
                "Engeheiro",
                "Evangelico",
                "Feira de Santana",
                "Ribeirao Preto",
                "Anemia",
                "Perda de Apetite e Falta de Energia",
                "SEM CONTEUDO",
                "HISTORIA PATOLOGICA, AQUI",
                "SOMENTE O VO POSSUI Anemia",
                "nao possui");
                caso2.addEspecialidade(Especialidade.CLINICA_MEDICA);

                CasoClinicoModelo caso3 = new CasoClinicoModelo(3,
                3,
                "Pedro",
                10,
                1.60,
                75.00,
                "Masculino",
                "PRETO",
                "Estudante",
                "Católico",
                "Três Lagoas",
                "Três Lagoas",
                "Diabetes do Tipo 1",
                "Perda de Apetite e Falta de Energia",
                "SEM CONTEUDO",
                "HISTORIA PATOLOGICA, AQUI",
                "SOMENTE O PAI POSSUI DIABETES",
                "nao possui");
                caso3.addEspecialidade(Especialidade.PEDIATRIA);

        repository.saveAll(Arrays.asList(caso1, caso2, caso3));
    }
}
