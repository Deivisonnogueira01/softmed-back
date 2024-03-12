package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.Pergunta;

@Service
public interface PerguntaService {

    
    public Pergunta criarPergunta(Pergunta pergunta);


    public List<Pergunta> findByEspecialidade(Especialidade especialidade);

}
