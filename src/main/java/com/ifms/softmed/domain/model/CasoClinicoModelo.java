package com.ifms.softmed.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CasoClinicoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer casoClinicoId;

    private Integer numero;

  /*  @OneToMany(mappedBy = "casoClinicoModelo")
    private List<InformacoesCasoClinico> informacoes;*/

    @Column(name = "nome")
    private String nomePaciente;

    private Integer idadePaciente;

    private Double alturaPaciente;

    private Double pesoPaciente;

    private String sexoPaciente;

    private String corPaciente;

    private String profissaoPaciente;

    private String religiaoPaciente;

    private String naturalPaciente;

    private String residentePaciente;

    private String HistoriaDoencaAtual;

    private String queixaPrincipal;

    private String interrogatorioDiversosAparelhos;

    private String historiaPatologicaPregressa;

    private String historiaFamiliar;

    private String historiaPsicossocial;

    
   

 
}
