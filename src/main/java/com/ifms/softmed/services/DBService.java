package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.enums.Patologia;
import com.ifms.softmed.domain.enums.Perfil;
import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.repositories.PessoaRepository;

@Service
public class DBService {

        @Autowired
        private CasoClinicoRepository repository;

        @Autowired
        private PessoaRepository repository2;

        @Autowired
        private BCryptPasswordEncoder encoder;

        public void instanciaDb() {

                Administrator admin1 = new Administrator(null, "deivison.nogueira@live.com",
                                encoder.encode("123"));
                admin1.addPerfil(Perfil.ADMIN);

               /*  CasoClinicoModelo caso1 = new CasoClinicoModelo(1,
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
                                "Diabetes do Tipo 1", // HDA
                                "Perda de Apetite e Falta de Energia", // QP
                                "Não Há Registros", // IDA
                                "Não Há Registros", /// HPP
                                "SOMENTE O PAI POSSUI DIABETES", // HF
                                "nao possui",
                                Especialidade.MEDICINA_DA_FAMILIA,
                                Patologia.GOTA);*/
                
        
               // repository.saveAll(Arrays.asList(caso1));

                repository2.saveAll(Arrays.asList(admin1));
        }
}
