package com.ifms.softmed.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.dto.CasoClinicoDTO;

@Entity
public class CasoClinicoModelo implements Serializable{
         
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer casoClinicoId;

    protected Integer numero;

    protected String nomePaciente;

    protected Integer idadePaciente;

    protected Double alturaPaciente;

    protected Double pesoPaciente;

    protected String sexoPaciente;

    protected String corPaciente;

    protected String profissaoPaciente;

    protected String religiaoPaciente;

    protected String naturalPaciente;

    protected String residentePaciente;

    protected String historiaDoencaAtual;

    protected String queixaPrincipal;

    protected String interrogatorioDiversosAparelhos;

    protected String historiaPatologicaPregressa;

    protected String historiaFamiliar;

    protected String historiaPsicossocial;

    @Enumerated(EnumType.STRING)
    protected Especialidade especialidade;

    public CasoClinicoModelo(){
        super();
    }

    public CasoClinicoModelo(Integer casoClinicoId, Integer numero, String nomePaciente, Integer idadePaciente,
            Double alturaPaciente, Double pesoPaciente, String sexoPaciente, String corPaciente,
            String profissaoPaciente, String religiaoPaciente, String naturalPaciente, String residentePaciente,
            String historiaDoencaAtual, String queixaPrincipal, String interrogatorioDiversosAparelhos,
            String historiaPatologicaPregressa, String historiaFamiliar, String historiaPsicossocial, Especialidade especialidade
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
        this.especialidade = especialidade;
    }

    
    public CasoClinicoModelo(CasoClinicoDTO obj) {
        super();
        this.casoClinicoId = obj.getCasoClinicoId();
        this.numero = obj.getNumero();
        this.nomePaciente = obj.getNomePaciente();
        this.idadePaciente = obj.getIdadePaciente();
        this.alturaPaciente = obj.getAlturaPaciente();
        this.pesoPaciente = obj.getPesoPaciente();
        this.sexoPaciente = obj.getSexoPaciente();
        this.corPaciente = obj.getCorPaciente();
        this.profissaoPaciente = obj.getProfissaoPaciente();
        this.religiaoPaciente = obj.getReligiaoPaciente();
        this.naturalPaciente = obj.getNaturalPaciente();
        this.residentePaciente = obj.getResidentePaciente();
        this.historiaDoencaAtual = obj.getHistoriaDoencaAtual();
        this.queixaPrincipal = obj.getQueixaPrincipal();
        this.interrogatorioDiversosAparelhos = obj.getInterrogatorioDiversosAparelhos();
        this.historiaPatologicaPregressa = obj.getHistoriaPatologicaPregressa();
        this.historiaFamiliar = obj.getHistoriaFamiliar();
        this.historiaPsicossocial = obj.getHistoriaPsicossocial();
        this.especialidade = obj.getTipoEspecialidade();
    }

    public Especialidade getTipoEspecialidade() {
        return especialidade;
    }

    public void setTipoEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getCasoClinicoId() {
        return casoClinicoId;
    }

    public void setCasoClinicoId(Integer casoClinicoId) {
        this.casoClinicoId = casoClinicoId;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Integer getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(Integer idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public Double getAlturaPaciente() {
        return alturaPaciente;
    }

    public void setAlturaPaciente(Double alturaPaciente) {
        this.alturaPaciente = alturaPaciente;
    }

    public Double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(Double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getCorPaciente() {
        return corPaciente;
    }

    public void setCorPaciente(String corPaciente) {
        this.corPaciente = corPaciente;
    }

    public String getProfissaoPaciente() {
        return profissaoPaciente;
    }

    public void setProfissaoPaciente(String profissaoPaciente) {
        this.profissaoPaciente = profissaoPaciente;
    }

    public String getReligiaoPaciente() {
        return religiaoPaciente;
    }

    public void setReligiaoPaciente(String religiaoPaciente) {
        this.religiaoPaciente = religiaoPaciente;
    }

    public String getNaturalPaciente() {
        return naturalPaciente;
    }

    public void setNaturalPaciente(String naturalPaciente) {
        this.naturalPaciente = naturalPaciente;
    }

    public String getResidentePaciente() {
        return residentePaciente;
    }

    public void setResidentePaciente(String residentePaciente) {
        this.residentePaciente = residentePaciente;
    }

    public String getHistoriaDoencaAtual() {
        return historiaDoencaAtual;
    }

    public void setHistoriaDoencaAtual(String historiaDoencaAtual) {
        this.historiaDoencaAtual = historiaDoencaAtual;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getInterrogatorioDiversosAparelhos() {
        return interrogatorioDiversosAparelhos;
    }

    public void setInterrogatorioDiversosAparelhos(String interrogatorioDiversosAparelhos) {
        this.interrogatorioDiversosAparelhos = interrogatorioDiversosAparelhos;
    }

    public String getHistoriaPatologicaPregressa() {
        return historiaPatologicaPregressa;
    }

    public void setHistoriaPatologicaPregressa(String historiaPatologicaPregressa) {
        this.historiaPatologicaPregressa = historiaPatologicaPregressa;
    }

    public String getHistoriaFamiliar() {
        return historiaFamiliar;
    }

    public void setHistoriaFamiliar(String historiaFamiliar) {
        this.historiaFamiliar = historiaFamiliar;
    }

    public String getHistoriaPsicossocial() {
        return historiaPsicossocial;
    }

    public void setHistoriaPsicossocial(String historiaPsicossocial) {
        this.historiaPsicossocial = historiaPsicossocial;
    }

}
