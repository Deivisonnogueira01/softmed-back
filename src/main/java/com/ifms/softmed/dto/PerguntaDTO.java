package com.ifms.softmed.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.Pergunta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PerguntaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer id;

    protected String pergunta;

    protected List<AlternativaDTO> alternativas;

    protected int respostaCorreta;

    protected Especialidade especialidade;

    public PerguntaDTO(Pergunta obj) {
        this.id = obj.getId();
        this.pergunta = obj.getPergunta();

        if (obj.getAlternativas() != null) {

            List<AlternativaDTO> alternativaDTOs = obj.getAlternativas()
                    .stream()
                    .map(alternativaObj -> new AlternativaDTO(alternativaObj))
                    .collect(Collectors.toList());
            this.alternativas = alternativaDTOs;
        }
    }

}
