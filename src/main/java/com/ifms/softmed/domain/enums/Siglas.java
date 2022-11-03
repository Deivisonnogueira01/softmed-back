package com.ifms.softmed.domain.enums;

public enum Siglas {
    
     QP(0, "QP");

    private Integer codigo;
    private String descricao;

    private Siglas(Integer codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    private Integer getCodigo(){
       return codigo;
    }

    private String getDescricao(){
        return descricao;
    }

    public static Siglas toEnum(Integer cod){
        if(cod == null){
          return null;
        }

        for(Siglas x : Siglas.values()) {
          if(cod.equals(x.getCodigo())){
            return x;
          }
        }

        throw new IllegalArgumentException("Sigla Não Existe");
    }

    //QP: String;
}
