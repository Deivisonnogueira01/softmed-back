package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinicoModelo;

public class CasoClinicoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    protected Especialidade especialidade;

    public CasoClinicoDTO() {
        super();
    }

    public CasoClinicoDTO(CasoClinicoModelo obj) {
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
