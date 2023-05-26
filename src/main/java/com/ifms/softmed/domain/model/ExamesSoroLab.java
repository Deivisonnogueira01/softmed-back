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

@Entity
public class ExamesSoroLab implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExamesSorologicoLaboratoriais;

    private String exameCorretos;

    private String exameIncorretos;

    @ManyToMany
    @JoinTable(name ="exame_soro_caso",
    joinColumns = @JoinColumn(name = "exame_soro_id"),
    inverseJoinColumns = @JoinColumn(name = "caso_cli_id"))
    private List<CasoClinicoModelo> casoClinicoModelos = new ArrayList<>();

    public ExamesSoroLab(){
        
    }

    public ExamesSoroLab(Integer idExamesSorologicoLaboratoriais, String exameCorretos,
            String exameIncorretos) {
        this.idExamesSorologicoLaboratoriais = idExamesSorologicoLaboratoriais;
        this.exameCorretos = exameCorretos;
        this.exameIncorretos = exameIncorretos;
    }

    public List<CasoClinicoModelo> getCasoClinicoModelos() {
        return casoClinicoModelos;
    }

    public void setCasoClinicoModelos(List<CasoClinicoModelo> casoClinicoModelos) {
        this.casoClinicoModelos = casoClinicoModelos;
    }

    public Integer getIdExamesSorologicoLaboratoriais() {
        return idExamesSorologicoLaboratoriais;
    }

    public void setIdExamesSorologicoLaboratoriais(Integer idExamesSorologicoLaboratoriais) {
        this.idExamesSorologicoLaboratoriais = idExamesSorologicoLaboratoriais;
    }

    public String getExameCorreto() {
        return exameCorretos;
    }

    public void setExameCorreto(String exameCorreto) {
        this.exameCorretos = exameCorreto;
    }

    public String getExameIncorreto() {
        return exameIncorretos;
    }

    public void setExameIncorreto(String exameIncorreto) {
        this.exameIncorretos = exameIncorreto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((idExamesSorologicoLaboratoriais == null) ? 0 : idExamesSorologicoLaboratoriais.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExamesSoroLab other = (ExamesSoroLab) obj;
        if (idExamesSorologicoLaboratoriais == null) {
            if (other.idExamesSorologicoLaboratoriais != null)
                return false;
        } else if (!idExamesSorologicoLaboratoriais.equals(other.idExamesSorologicoLaboratoriais))
            return false;
        return true;
    }

}
