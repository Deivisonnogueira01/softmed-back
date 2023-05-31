package com.ifms.softmed.dto;

import com.ifms.softmed.domain.model.ExamesFisicos;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExameFisicosDTO {
    
    private Integer idExameFisicoDTO;

    private String examesCorretosFisicosDTO;

    private String examesIncorretosFisicosDTO;

     public ExameFisicosDTO(ExamesFisicos obj){
        this.idExameFisicoDTO = obj.getIdExame();
        this.examesCorretosFisicosDTO = obj.getExamesCorretos();
        this.examesIncorretosFisicosDTO = obj.getExamesIncorretos();
     }
}
