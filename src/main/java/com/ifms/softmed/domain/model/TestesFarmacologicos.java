package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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

    private String testeCorreto;
  
    private String testesIncorretos;

    @ManyToMany
    @JoinTable(name = "teste_de_caso",
    joinColumns = @JoinColumn(name = "teste_id"),
    inverseJoinColumns = @JoinColumn(name = "caso_farm_id"))
    private List<CasoClinicoModelo> casoCliFarm = new ArrayList<>();

    public TestesFarmacologicos(){
        
    }
    
    public TestesFarmacologicos(Integer idTestes, String testeCorreto, String testesIncorretos) {
        this.idTestes = idTestes;
        this.testeCorreto = testeCorreto;
        this.testesIncorretos = testesIncorretos;
    }

    public List<CasoClinicoModelo> getCasoCliFarm() {
        return casoCliFarm;
    }

    public void setCasoCliFarm(List<CasoClinicoModelo> casoCliFarm) {
        this.casoCliFarm = casoCliFarm;
    }

}
