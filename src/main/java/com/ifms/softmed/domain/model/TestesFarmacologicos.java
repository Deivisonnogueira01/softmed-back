package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TestesFarmacologicos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTestes;

    @ElementCollection
    private List<String> testeCorreto;

    @ElementCollection
    private List<String> testesIncorretos;

    @ManyToMany(mappedBy = "testesFarmacologicos")
    private List<CasoClinicoModelo> casoClinicoModelos;

    
    public TestesFarmacologicos(Integer idTestes, List<String> testeCorreto, List<String> testesIncorretos) {
        this.idTestes = idTestes;
        this.testeCorreto = testeCorreto;
        this.testesIncorretos = testesIncorretos;
    }

    public Integer getIdTestes() {
        return idTestes;
    }

    public void setIdTestes(Integer idTestes) {
        this.idTestes = idTestes;
    }

    public List<String> getTesteCorreto() {
        return testeCorreto;
    }

    public void setTesteCorreto(List<String> testeCorreto) {
        this.testeCorreto = testeCorreto;
    }

    public List<String> getTestesIncorretos() {
        return testesIncorretos;
    }

    public void setTestesIncorretos(List<String> testesIncorretos) {
        this.testesIncorretos = testesIncorretos;
    }


    

}
