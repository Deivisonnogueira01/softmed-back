package com.ifms.softmed.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.Alternativa;
import com.ifms.softmed.domain.model.Pergunta;
import com.ifms.softmed.repositories.AlternativaRepository;
import com.ifms.softmed.repositories.PerguntaRepository;
import com.ifms.softmed.services.PerguntaService;


@Service
public class PerguntaServiceImpl implements PerguntaService {

    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private AlternativaRepository alternativaRepository;

    @Override
    @SuppressWarnings("null")
    public Pergunta criarPergunta(Pergunta pergunta) {

        
        Pergunta novaPergunta = perguntaRepository.save(pergunta);

        // Associar cada alternativa à pergunta e salvar no banco de dados
        for (Alternativa alternativa : pergunta.getAlternativas()) {
            alternativa.setPergunta(novaPergunta);
            alternativaRepository.save(alternativa);
        }

        return novaPergunta;

    }

    @Override
    public List<Pergunta> findByEspecialidade(Especialidade especialidade) {
        return perguntaRepository.findByEspecialidade(especialidade);            
    }

    


}
