package com.ifms.softmed.domain.enums;

public enum Especialidade {


   OBSTETRICIA("OBSTETRICIA"),
   MEDICINA_DA_FAMILIA("MEDICINA_DA_FAMILIA"),
   GINECOLOGIA("GINECOLOGIA"),
   CLINICA_MEDICA("CLINICA_MEDICA"),
   CIRURGIA("CIRURGIA"),
   PEDIATRIA("PEDIATRIA"),
   RANDOMICO("RANDOMICO");

   private String especialidade;

   private Especialidade(String especialidade) {
      this.especialidade = especialidade;
   }

   public String getEspecialidade() {
      return especialidade;
   }

}
