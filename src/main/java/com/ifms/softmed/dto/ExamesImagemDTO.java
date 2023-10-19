package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.model.ExamesImagem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExamesImagemDTO implements Serializable { 

    private static final long serialVersionUID = 1L;

    private Integer idExameImagemDTO;

    private String examesImagemCorreto;

    private String exameImagemIncorretos;


    public ExamesImagemDTO(ExamesImagem obj){
        this.idExameImagemDTO = obj.getIdExameImagem();
        this.examesImagemCorreto = obj.getExamesImagemCorreto();
        this.exameImagemIncorretos = obj.getExamesImagemIncorretos();
        
    }
}
