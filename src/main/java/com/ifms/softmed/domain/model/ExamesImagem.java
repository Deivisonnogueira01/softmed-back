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
public class ExamesImagem implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExameImagem;

    @ElementCollection
    private List<String> examesCorretos;

    @ElementCollection
    private List<String> examesIncorretos;

    @ManyToMany(mappedBy = "examesImagems")
    private List<CasoClinicoModelo> casoClinicoModelos;

    public ExamesImagem(Integer idExameImagem, List<String> examesCorretos, List<String> examesIncorretos) {
        this.idExameImagem = idExameImagem;
        this.examesCorretos = examesCorretos;
        this.examesIncorretos = examesIncorretos;
    }

    public Integer getIdExameImagem() {
        return idExameImagem;
    }

    public void setIdExameImagem(Integer idExameImagem) {
        this.idExameImagem = idExameImagem;
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

 /*    public List<CasoClinicoModelo> getCasoClinicoModelos() {
        return casoClinicoModelos;
    }

    public void setCasoClinicoModelos(List<CasoClinicoModelo> casoClinicoModelos) {
        this.casoClinicoModelos = casoClinicoModelos;
    }*/

    
}
