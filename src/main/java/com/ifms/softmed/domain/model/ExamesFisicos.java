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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class ExamesFisicos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExame;

    private String examesCorretos;

    private String examesIncorretos;

    @ManyToMany
    @JoinTable(name = "caso_cli_ex_fisico",
    joinColumns = @JoinColumn(name ="caso_cli_id"),
    inverseJoinColumns = @JoinColumn(name ="exame_fi_id"))
    private List<CasoClinicoModelo> casoCliExFisico = new ArrayList<>();

    public ExamesFisicos(){

    }

    public ExamesFisicos(Integer idExame, String examesCorretos, String examesIncorretos) {
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

    public String getExamesCorretos() {
        return examesCorretos;
    }

    public void setExamesCorretos(String examesCorretos) {
        this.examesCorretos = examesCorretos;
    }

    public String getExamesIncorretos() {
        return examesIncorretos;
    }

    public void setExamesIncorretos(String examesIncorretos) {
        this.examesIncorretos = examesIncorretos;
    }

    public List<CasoClinicoModelo> getCasoCliExFisico() {
        return casoCliExFisico;
    }

    public void setCasoCliExFisico(List<CasoClinicoModelo> casoCliExFisico) {
        this.casoCliExFisico = casoCliExFisico;
    }

    
    
}
