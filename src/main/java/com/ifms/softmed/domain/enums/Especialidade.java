package com.ifms.softmed.domain.enums;

public enum Especialidade {
    

    CLINICA_MEDICA(0, "CLINICA_MEDICA"),
    CARDIOLOGIA(1, "CARDIOLOGIA"),
    NEUROLOGIA(2, "NEUROLOGIA"),
    PSQUIATRIA(3, "PSQUIATRIA"),
    ENDOCRINOLOGIA(4, "ENDOCRIONOLOGIA"),
    ORTOPEDIA(5, "ORTOPEDIA"),
    DERMATOLOGIA(6,"DERMATOLOGIA"),
    OFTALMOLOGIA(7, "OFTALMOLOGIA"),
    ANESTESIOLOGIA(8, "ANESTESIOLOGIA"),
    GINECOLOGIA(9, "GINECOLOGIA"),
    PEDIATRIA(10, "PEDIATRIA"),
    RANDOMICO(11,"RANDOMICO");


    private Integer codigoEspecialidade;
    private String especialidade;


     private Especialidade(Integer codigoEspecialidade, String especialidade){
        this.codigoEspecialidade = codigoEspecialidade;
        this.especialidade = especialidade;
     }

     public Integer getCodigoEspecialidade(){
        return codigoEspecialidade;
     }

     public String getEspecialidade(){
        return especialidade;
     }

     public static Especialidade toEspec(Integer cod){
        if(cod == null){
            return null;
        }

        for(Especialidade e : Especialidade.values()){
            if(cod.equals(e.getCodigoEspecialidade())){
                return e;
            }
        }
        throw new IllegalArgumentException("Especialidade Não Existe");
     }
}
