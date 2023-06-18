package com.ifms.softmed.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifms.softmed.dto.TestesFarmacologicosDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TestesFarmacologicos implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTestes;

    private String testeFarma;
  
    @ManyToOne
    @JoinColumn(name = "teste_id")
    @JsonIgnore
    private CasoClinicoModelo casot;

    public TestesFarmacologicos(){
        
    }
    
    public TestesFarmacologicos(Integer idTestes, String testesFarma) {
        this.idTestes = idTestes;
        this.testeFarma = testesFarma;
        
    }

    public TestesFarmacologicos(TestesFarmacologicosDTO obj){
        this.idTestes = obj.getIdTestesDTO();
        this.testeFarma = obj.getTestesFarma();
    }


}
