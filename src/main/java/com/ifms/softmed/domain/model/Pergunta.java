package com.ifms.softmed.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.dto.PerguntaDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pergunta_id") 
    private Integer id;

    private String pergunta;

    @OneToMany(mappedBy = "pergunta")
    private List<Alternativa> alternativas = new ArrayList<>();

    private Integer respostaCorreta;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;


    public Pergunta(PerguntaDTO obj) {
        this.id = obj.getId();
        this.pergunta = obj.getPergunta();
        if(obj.getAlternativas() != null){
            List<Alternativa> alternativasList = obj.getAlternativas()
            .stream()
            .map(alternativoObj -> new Alternativa(alternativoObj))
            .collect(Collectors.toList());
            this.alternativas = alternativasList;
        }
        this.respostaCorreta = obj.getRespostaCorreta();
        this.especialidade = obj.getEspecialidade();
    }

    public void addAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
    }

    
    public Especialidade getTipoEspecialidade() {
        return especialidade;
    }

    public void setTipoEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }


}

