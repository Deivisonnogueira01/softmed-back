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
  
    private String examesImagem;

    @ManyToOne
    @JoinColumn(name = "image_id")
    @JsonIgnore
    private CasoClinico casoi;

    public ExamesImagem(){
        
    }

    public ExamesImagem(Integer idExameImagem, String examesImagem) {
        this.idExameImagem = idExameImagem;
        this.examesImagem = examesImagem;
    
    }

    public ExamesImagem(ExamesImagemDTO obj){
        this.idExameImagem = obj.getIdExameImagemDTO();
        this.examesImagem = obj.getExamesImagem();
    }

  
}
