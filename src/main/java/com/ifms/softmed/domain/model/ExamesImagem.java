package com.ifms.softmed.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifms.softmed.dto.ExamesImagemDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExamesImagem implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExameImagem;
  
    private String examesImagemCorreto;

    private String examesImagemIncorretos;

    @ManyToOne
    @JoinColumn(name = "caso_id")
    @JsonIgnore
    private CasoClinico casoi;

    public ExamesImagem(){
        
    }

    public ExamesImagem(Integer idExameImagem, String examesImagemCorreto, String exameIncorretos) {
        this.idExameImagem = idExameImagem;
        this.examesImagemCorreto = examesImagemCorreto;
        this.examesImagemIncorretos = exameIncorretos;
    }

    public ExamesImagem(ExamesImagemDTO obj){
        this.idExameImagem = obj.getIdExameImagemDTO();
        this.examesImagemCorreto = obj.getExamesImagemCorreto();
        this.examesImagemIncorretos = obj.getExameImagemIncorretos();
    }

    public ExamesImagem(ExamesImagemDTO exameDTO, CasoClinico casoClinico) {
        this.examesImagemCorreto = exameDTO.getExamesImagemCorreto();
        this.examesImagemIncorretos = exameDTO.getExameImagemIncorretos();  // Corrigido aqui
        this.casoi = casoClinico;
    }
}
