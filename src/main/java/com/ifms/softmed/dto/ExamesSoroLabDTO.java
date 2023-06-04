package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.model.ExamesSoroLab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExamesSoroLabDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Integer idExameSoroLabDTO;

    private String examesCorretosSoroLabDTO;

    private String examesIncorretosSoroLabDTO;
 
    public ExamesSoroLabDTO(ExamesSoroLab obj){
        this.idExameSoroLabDTO = obj.getIdExamesSorologicoLaboratoriais();
        this.examesCorretosSoroLabDTO = obj.getExameCorretos();
        this.examesIncorretosSoroLabDTO = obj.getExameIncorretos();
    }
}
