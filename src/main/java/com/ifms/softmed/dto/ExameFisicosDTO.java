package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.model.ExamesFisicos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExameFisicosDTO implements Serializable {

   private static final long serialVersionUID = 1L;

   private Integer idExameFisicoDTO;

   private String examesCorretosFisicosDTO;

   private String examesIncorretosFisicosDTO;

   public ExameFisicosDTO(ExamesFisicos obj) {
      this.idExameFisicoDTO = obj.getIdExame();
      this.examesCorretosFisicosDTO = obj.getExamesCorretos();
      this.examesIncorretosFisicosDTO = obj.getExamesIncorretos();
   }
}
