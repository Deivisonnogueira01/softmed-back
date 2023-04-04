package com.ifms.softmed.domain.enums;

public enum Especialidade {
    
    CLINICA_MEDICA( "CLINICA_MEDICA"),
    CARDIOLOGIA( "CARDIOLOGIA"),
    NEUROLOGIA( "NEUROLOGIA"),
    PSQUIATRIA( "PSQUIATRIA"),
    ENDOCRINOLOGIA( "ENDOCRIONOLOGIA"),
    ORTOPEDIA("ORTOPEDIA"),
    DERMATOLOGIA("DERMATOLOGIA"),
    OFTALMOLOGIA("OFTALMOLOGIA"),
    ANESTESIOLOGIA("ANESTESIOLOGIA"),
    GINECOLOGIA("GINECOLOGIA"),
    PEDIATRIA("PEDIATRIA"),
    RANDOMICO("RANDOMICO");


    private String especialidade;


     private Especialidade(String especialidade){
        this.especialidade = especialidade;
     }


     public String getEspecialidade(){
        return especialidade;
     }

}
