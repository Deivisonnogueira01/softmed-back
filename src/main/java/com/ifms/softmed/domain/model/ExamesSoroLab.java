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
public class ExamesSoroLab implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExamesSorologicoLaboratoriais;
      
    @ElementCollection
    private List<String> exameCorretos;

    @ElementCollection
    private List<String> exameIncorretos;

    @ManyToMany(mappedBy = "examesSoroLabs")
    private List<CasoClinicoModelo> casoClinicoModelos;

    public ExamesSoroLab(Integer idExamesSorologicoLaboratoriais, List<String> exameCorretos,
            List<String> exameIncorretos) {
        this.idExamesSorologicoLaboratoriais = idExamesSorologicoLaboratoriais;
        this.exameCorretos = exameCorretos;
        this.exameIncorretos = exameIncorretos;
    }

    public Integer getIdExamesSorologicoLaboratoriais() {
        return idExamesSorologicoLaboratoriais;
    }

    public void setIdExamesSorologicoLaboratoriais(Integer idExamesSorologicoLaboratoriais) {
        this.idExamesSorologicoLaboratoriais = idExamesSorologicoLaboratoriais;
    }

    public List<String> getExameCorreto() {
        return exameCorretos;
    }

    public void setExameCorreto(List<String> exameCorreto) {
        this.exameCorretos = exameCorreto;
    }

    public List<String> getExameIncorreto() {
        return exameIncorretos;
    }

    public void setExameIncorreto(List<String> exameIncorreto) {
        this.exameIncorretos = exameIncorreto;
    }

}
