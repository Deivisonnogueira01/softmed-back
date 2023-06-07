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
import com.ifms.softmed.domain.model.ExamesFisicos;
import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.domain.model.ExamesSoroLab;
import com.ifms.softmed.domain.model.TestesFarmacologicos;
import com.ifms.softmed.repositories.CasoClinicoRepository;
import com.ifms.softmed.repositories.ExameFisicoRepository;
import com.ifms.softmed.repositories.ExameImagemRepository;
import com.ifms.softmed.repositories.ExameSoroLabRepository;
import com.ifms.softmed.repositories.PessoaRepository;
import com.ifms.softmed.repositories.TestesFarmaRepository;

@Service
public class DBService {

        @Autowired
        private CasoClinicoRepository casoClinicoRepository;

        @Autowired
        private PessoaRepository repository2;

        @Autowired
        private ExameFisicoRepository exameFisicoRepository;

        @Autowired
        private ExameImagemRepository exameImagemRepository;

        @Autowired
        private ExameSoroLabRepository exameSoroLabRepository;

        @Autowired
        private TestesFarmaRepository testesFarmaRepository;

        @Autowired
        private BCryptPasswordEncoder encoder;

        public void instanciaDb() {

                Administrator admin1 = new Administrator(null, "deivison.nogueira@live.com",
                                encoder.encode("123"));
                admin1.addPerfil(Perfil.ADMIN);

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
                                "Diabetes do Tipo 1", // HDA
                                "Perda de Apetite e Falta de Energia", // QP
                                "Não Há Registros", // IDA
                                "Não Há Registros", /// HPP
                                "SOMENTE O PAI POSSUI DIABETES", // HF
                                "nao possui",
                                Especialidade.MEDICINA_DA_FAMILIA,
                                Patologia.GOTA);

                ExamesFisicos examesFisicos = new ExamesFisicos(null, "ExCorretoFisico", "ExIncorretoFisico");
                ExamesFisicos examesFisicos2 = new ExamesFisicos(null, "ExCorretoFisico2", "ExIncorretoFisico2");

                ExamesImagem examesImagem = new ExamesImagem(null, "testeImagemCorreto", "testeImagemIncorreto");
                ExamesImagem examesImagem2 = new ExamesImagem(null, "testeImagemCorreto2", "testeImagemIncorreto2");

                ExamesSoroLab examesSoroLab = new ExamesSoroLab(null, "testeExameSoroCorreto", "testeExameIncorreto");
                ExamesSoroLab examesSoroLab2 = new ExamesSoroLab(null, "testeExameSoroCorreto2", "testeExameIncorreto2");

                TestesFarmacologicos testesFarmacologicos = new TestesFarmacologicos(null, "teste", "testeIncorreto");
                TestesFarmacologicos testesFarmacologicos2 = new TestesFarmacologicos(null, "teste2", "testeIncorreto2");



                caso1.getExamesFisicos().addAll(Arrays.asList(examesFisicos, examesFisicos2));
                caso1.getExamesImagems().addAll(Arrays.asList(examesImagem, examesImagem2));
                caso1.getExamesSoroLabs().addAll(Arrays.asList(examesSoroLab, examesSoroLab2));
                caso1.getTestesFarmacologicos().addAll(Arrays.asList(testesFarmacologicos,testesFarmacologicos2));
                

                examesFisicos.getCasoCliExFisico().addAll(Arrays.asList(caso1));
                examesFisicos2.getCasoCliExFisico().addAll(Arrays.asList(caso1));

                examesImagem.getCasoClinicoEIMG().addAll(Arrays.asList(caso1));
                examesImagem2.getCasoClinicoEIMG().addAll(Arrays.asList(caso1));

                examesSoroLab.getCasoClinicoModelos().addAll(Arrays.asList(caso1));
                examesSoroLab2.getCasoClinicoModelos().addAll(Arrays.asList(caso1));

                testesFarmacologicos.getCasoCliFarm().addAll(Arrays.asList(caso1));
                testesFarmacologicos2.getCasoCliFarm().addAll(Arrays.asList(caso1));

                casoClinicoRepository.saveAll(Arrays.asList(caso1));
                exameFisicoRepository.saveAll(Arrays.asList(examesFisicos,examesFisicos2));
                exameImagemRepository.saveAll(Arrays.asList(examesImagem, examesImagem2));
                exameSoroLabRepository.saveAll(Arrays.asList(examesSoroLab,examesSoroLab2));
                testesFarmaRepository.saveAll(Arrays.asList(testesFarmacologicos,testesFarmacologicos2));
                
                repository2.saveAll(Arrays.asList(admin1));
        }
}
