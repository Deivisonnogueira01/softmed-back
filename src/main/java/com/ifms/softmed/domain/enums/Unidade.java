package com.ifms.softmed.domain.enums;

public enum Unidade {
    
    MLDL(0, "ml/dl");

    private Integer quantidade;
    private String desc;


    private Unidade(Integer quantidade, String desc){
       this.quantidade = quantidade;
       this.desc = desc;
    }

   private Double getQuantidade(Double quantidade){
      return quantidade;
   }

   private String getDesc(String desc){
      return desc;
   }

}
