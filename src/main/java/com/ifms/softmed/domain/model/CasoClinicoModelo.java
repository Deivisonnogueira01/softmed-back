package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ifms.softmed.domain.enums.Especialidade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name = "casos_clinicos")
@Getter
@Setter
@NoArgsConstructor
public class CasoClinicoModelo implements Serializable{
         
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer casoClinicoId;

    @Column(name = "numero_caso_clinico")
    protected Integer numero;

    @Column(name = "nome")
    protected String nomePaciente;

    @Column(name = "idade")
    protected Integer idadePaciente;

    @Column(name = "altura")
    protected Double alturaPaciente;

    @Column(name = "peso")
    protected Double pesoPaciente;

    @Column(name = "sexo")
    protected String sexoPaciente;

    @Column(name = "cor")
    protected String corPaciente;

    @Column(name = "profissao")
    protected String profissaoPaciente;

    @Column(name = "religiao")
    protected String religiaoPaciente;

    @Column(name = "natural")
    protected String naturalPaciente;

    @Column(name = "residente")
    protected String residentePaciente;

    @Column(name = "hda")
    protected String historiaDoencaAtual;

    @Column(name = "qp")
    protected String queixaPrincipal;

    @Column(name = "ida")
    protected String interrogatorioDiversosAparelhos;

    @Column(name = "hpp")
    protected String historiaPatologicaPregressa;

    @Column(name = "hf")
    protected String historiaFamiliar;

    @Column(name = "hps")
    protected String historiaPsicossocial;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ESPECIALIDADES")
    protected Set<Integer> especialidades = new HashSet<>();

    
    public CasoClinicoModelo(Integer casoClinicoId, Integer numero, String nomePaciente, Integer idadePaciente,
            Double alturaPaciente, Double pesoPaciente, String sexoPaciente, String corPaciente,
            String profissaoPaciente, String religiaoPaciente, String naturalPaciente, String residentePaciente,
            String historiaDoencaAtual, String queixaPrincipal, String interrogatorioDiversosAparelhos,
            String historiaPatologicaPregressa, String historiaFamiliar, String historiaPsicossocial
            ) {
        this.casoClinicoId = casoClinicoId;
        this.numero = numero;
        this.nomePaciente = nomePaciente;
        this.idadePaciente = idadePaciente;
        this.alturaPaciente = alturaPaciente;
        this.pesoPaciente = pesoPaciente;
        this.sexoPaciente = sexoPaciente;
        this.corPaciente = corPaciente;
        this.profissaoPaciente = profissaoPaciente;
        this.religiaoPaciente = religiaoPaciente;
        this.naturalPaciente = naturalPaciente;
        this.residentePaciente = residentePaciente;
        this.historiaDoencaAtual = historiaDoencaAtual;
        this.queixaPrincipal = queixaPrincipal;
        this.interrogatorioDiversosAparelhos = interrogatorioDiversosAparelhos;
        this.historiaPatologicaPregressa = historiaPatologicaPregressa;
        this.historiaFamiliar = historiaFamiliar;
        this.historiaPsicossocial = historiaPsicossocial;
    }

    public Set<Especialidade> getEspecialidade(){
      return especialidades.stream().map(x -> Especialidade.toEspec(x)).collect(Collectors.toSet());
    }

    public void addEspecialidade(Especialidade especialidade){{
        this.especialidades.add(especialidade.getCodigoEspecialidade());
    }}

}
