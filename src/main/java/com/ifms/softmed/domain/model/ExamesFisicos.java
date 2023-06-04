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

import com.ifms.softmed.dto.ExameFisicosDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
    
    public ExamesFisicos(Integer id, String examesCorretos, String examesIncorretos){
        this.idExame = id;
        this.examesCorretos = examesCorretos;
        this.examesIncorretos = examesIncorretos;
    }

    public ExamesFisicos(ExameFisicosDTO obj){
        this.idExame = obj.getIdExameFisicoDTO();
        this.examesCorretos = obj.getExamesCorretosFisicosDTO();
        this.examesIncorretos = obj.getExamesIncorretosFisicosDTO();
    }

    public List<CasoClinicoModelo> getCasoCliExFisico() {
        return casoCliExFisico;
    }

    public void setCasoCliExFisico(List<CasoClinicoModelo> casoCliExFisico) {
        this.casoCliExFisico = casoCliExFisico;
    }

    
    
}
