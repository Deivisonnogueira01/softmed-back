package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.enums.Patologia;
import com.ifms.softmed.domain.enums.Perfil;
import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.repositories.PessoaRepository;

@Service
public class DBService {

        @Autowired
        private CasoClinicoRepository casoClinicoRepository;

        @Autowired
        private PessoaRepository pessoaRepository;

        @Autowired
        private BCryptPasswordEncoder encoder;

        public void instanciaDb() {

                Administrator admin1 = new Administrator(null, "deivison.nogueira@live.com",
                                encoder.encode("123"));
                admin1.addPerfil(Perfil.ADMIN);

                Administrator aluno = new Administrator(null, "aluno.softmed@outlook.com",encoder.encode( "aluno"));
                aluno.addPerfil(Perfil.ALUNO);


                CasoClinico caso1 = new CasoClinico(null,
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
                                "nao",
                                Especialidade.MEDICINA_DA_FAMILIA,
                                Patologia.GOTA);

                casoClinicoRepository.saveAll(Arrays.asList(caso1));
                pessoaRepository.saveAll(Arrays.asList(admin1));
        }
}
