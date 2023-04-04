package com.ifms.softmed.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
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
                                "Diabetes do Tipo 1", // HDA
                                "Perda de Apetite e Falta de Energia", // QP
                                "Não Há Registros", // IDA
                                "Não Há Registros", /// HPP
                                "SOMENTE O PAI POSSUI DIABETES", // HF
                                "nao possui",
                                Especialidade.CARDIOLOGIA); // HPS

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
                                "Não Há Registros",
                                "Não Há Registros",
                                "Não Há Registros",
                                "nao possui",
                                Especialidade.CLINICA_MEDICA);

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
                                "nao possui",
                                Especialidade.PEDIATRIA);

                CasoClinicoModelo caso4 = new CasoClinicoModelo(4,
                                4,
                                "Roberta",
                                38,
                                1.68,
                                75.00,
                                "Feminino",
                                "Branco",
                                "Estudante",
                                "Católico",
                                "Três Lagoas",
                                "Três Lagoas",
                                " Ao chegar no Centro de Especialidades para uma consulta com Reumatologista tais do pé esquerdo",
                                "Diabetes do Tipo 1",

                                "Também alegou desconforto na região cervical, o qual não soube especificar. A paciente estava hidratada, eupneica, apirética, normotensa e normocárdica. A paciente apresentava notável emagrecimento.",
                                "Não Registrado",
                                "Não Registrado",
                                "nao possui",
                                Especialidade.CARDIOLOGIA);

                CasoClinicoModelo caso5 = new CasoClinicoModelo(5,
                                5,
                                "Fernanda",
                                30,
                                1.60,
                                56.00,
                                "Feminino",
                                "Branco",
                                "Estudante",
                                "Católico",
                                "Três Lagoas",
                                "Três Lagoas",
                                "Diabetes do Tipo 1",
                                "Ao chegar no Centro de Especialidades para uma consulta com Reumatologs distais do relatou amenorreia há quatro meses, irritabilidade pronunciada, cansaço e ganho de peso. ",

                                "Gerais: relata astenia, sudorese. Nega febre, prurido. ",
                                "Nega hábitos medicamentosos. Sem antecedentes (pessoais ou patológicos) ",
                                "Sem hábitos tabágicos, alcoólicos ou consumo de drogas.",
                                "Não possui",
                                Especialidade.CLINICA_MEDICA);

                CasoClinicoModelo caso6 = new CasoClinicoModelo(6,
                                6,
                                "Gabriela",
                                74,
                                1.60,
                                56.00,
                                "Feminino",
                                "Branco",
                                "Estudante",
                                "Católico",
                                "Três Lagoas",
                                "Três Lagoas",
                                "A paciente refere dispneia há 5 dias, de início súbito e em repouso, com piora do sintoma há dois dias",
                                "Falta de ar há cinco dias.",
                                "Gerais: relata astenia, sudorese. Nega febre, prurido. ",
                                "HAS, em uso de HCTZ e captopril. Nega DM e disfunção tireoidiana",
                                "Mãe faleceu aos 63 anos com câncer colorretal. Pai era hipertenso e faleceu aos 70 anos, por IAM. Não sabe informar sobre os irmão.",
                                "Nega tabagismo e etilismo. Sedentária. Casa de alvenaria. Sem animais de estimação",
                                Especialidade.CLINICA_MEDICA);

                CasoClinicoModelo caso7 = new CasoClinicoModelo(7,
                                7,
                                "Fernanda",
                                55,
                                1.63,
                                90.00,
                                "Feminino",
                                "Branco",
                                "Estudante",
                                "Católico",
                                "Três Lagoas",
                                "Três Lagoas",
                                "A paciente refere dispneia há 5 dias, de início súbito e em repouso, com piora do sintoma há dois dias",
                                "Engordei muito nos últimos 2 anos",
                                "Gerais: relata astenia, sudorese. Nega febre, prurido",
                                "HAS, em uso de HCTZ e captopril. Nega DM e disfunção tireoidiana",
                                "Ex-tabagista (fumou dos 20 aos 52 anos, carga tabágica de 32 anos-maço). Nega etilismo. Sedentário. Casa de alvenaria. Dois cães e um gato.",
                                "Nega tabagismo e etilismo. Sedentária. Casa de alvenaria. Sem animais de estimação",
                                Especialidade.CLINICA_MEDICA);

                repository.saveAll(Arrays.asList(caso1, caso2, caso3, caso4, caso5, caso6, caso7));

                repository2.saveAll(Arrays.asList(admin1));
        }
}
