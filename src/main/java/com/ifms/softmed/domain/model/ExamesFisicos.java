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
public class ExamesFisicos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExame;

    @ElementCollection
    private List<String> examesCorretos;

    @ElementCollection
    private List<String> examesIncorretos;

    @ManyToMany(mappedBy = "examesFisicos")
    private List<CasoClinicoModelo> casoClinicoModelos;

    public ExamesFisicos(Integer idExame, List<String> examesCorretos, List<String> examesIncorretos) {
        this.idExame = idExame;
        this.examesCorretos = examesCorretos;
        this.examesIncorretos = examesIncorretos;
    }

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }

    public List<String> getExamesCorretos() {
        return examesCorretos;
    }

    public void setExamesCorretos(List<String> examesCorretos) {
        this.examesCorretos = examesCorretos;
    }

    public List<String> getExamesIncorretos() {
        return examesIncorretos;
    }

    public void setExamesIncorretos(List<String> examesIncorretos) {
        this.examesIncorretos = examesIncorretos;
    }

    
    
}
