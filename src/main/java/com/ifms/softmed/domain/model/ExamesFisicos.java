package com.ifms.softmed.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifms.softmed.dto.ExameFisicosDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExamesFisicos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExame;

    private String examesFisicosCorreto;

    private String examesFisicosIncorreto;

    @ManyToOne
    @JoinColumn(name = "caso_id")
    @JsonIgnore
    private CasoClinico casof;
 
    public ExamesFisicos(){
    }
    
    public ExamesFisicos(Integer id, String examesFisicosCorreto, String examesIncorreto){
        this.idExame = id;
        this.examesFisicosCorreto = examesFisicosCorreto;
        this.examesFisicosIncorreto = examesIncorreto;
    }

    public ExamesFisicos(ExameFisicosDTO obj){
        this.idExame = obj.getIdExameFisicoDTO();
        this.examesFisicosCorreto = obj.getExamesFisicosCorretoDTO();
        this.examesFisicosIncorreto = obj.getExamesFisicosIncorretoDTO();
    }


    
}
