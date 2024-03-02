package com.ifms.softmed.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifms.softmed.dto.AlternativaDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Alternativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    @JsonIgnore
    private Pergunta pergunta;

    private String alternativa;

    public Alternativa() {

    }

    public Alternativa(Integer id, String alternativa) {
        this.id = id;
        this.alternativa = alternativa;
    }

    public Alternativa(AlternativaDTO obj) {
        this.id = obj.getId();
        this.alternativa = obj.getAlternativa();
    }

    public Alternativa(AlternativaDTO alternativaDTO, Pergunta pergunta) {
        this.alternativa = alternativaDTO.getAlternativa();
        this.pergunta = pergunta;
    }

}
