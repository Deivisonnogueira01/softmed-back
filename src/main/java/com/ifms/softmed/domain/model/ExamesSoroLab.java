package com.ifms.softmed.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifms.softmed.dto.ExamesSoroLabDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class ExamesSoroLab implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSoro;

    private String examesSoroCorreto;

    private String examesSoroIncorreto;

    @ManyToOne
    @JoinColumn(name = "caso_id")
    @JsonIgnore
    private CasoClinico caso;

    public ExamesSoroLab(){
        
    }

    public ExamesSoroLab(Integer idSoro, String examesSoro,
            String exameIncorretos) {
        this.idSoro = idSoro;
        this.examesSoroCorreto = examesSoro;
        this.examesSoroIncorreto = exameIncorretos;
      
    }

    public ExamesSoroLab(ExamesSoroLabDTO obj){
        this.idSoro = obj.getIdExameSoroLabDTO();
        this.examesSoroCorreto = obj.getExamesSoroDTOCorreto();
        this.examesSoroIncorreto = obj.getExamesSoroDTOIncorreto();
    }

     public ExamesSoroLab(ExamesSoroLabDTO exameDTO, CasoClinico casoClinico) {
        this.examesSoroCorreto = exameDTO.getExamesSoroDTOCorreto();
        this.examesSoroIncorreto = exameDTO.getExamesSoroDTOIncorreto();
        this.caso = casoClinico;
    }

}

