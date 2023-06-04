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

import com.ifms.softmed.dto.ExamesSoroLabDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

    public ExamesSoroLab(ExamesSoroLabDTO obj){
        this.idExamesSorologicoLaboratoriais = obj.getIdExameSoroLabDTO();
        this.exameCorretos = obj.getExamesCorretosSoroLabDTO();
        this.exameIncorretos = obj.getExamesIncorretosSoroLabDTO();
    }

    public List<CasoClinicoModelo> getCasoClinicoModelos() {
        return casoClinicoModelos;
    }

    public void setCasoClinicoModelos(List<CasoClinicoModelo> casoClinicoModelos) {
        this.casoClinicoModelos = casoClinicoModelos;
    }


}
