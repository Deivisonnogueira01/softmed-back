package com.ifms.softmed.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.enums.Patologia;
import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.domain.model.ExamesFisicos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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

    protected Patologia patologia;

    private List<ExamesSoroLabDTO> soroLabDTOs = new ArrayList<>();

    private List<ExamesImagemDTO> imagemDTOs = new ArrayList<>();

    private List<ExameFisicosDTO> exameFisicosDTOs = new ArrayList<>();

    private List<TestesFarmacologicosDTO> testesDTO = new ArrayList<>();

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
        this.patologia = obj.getPatologia(); //extrair daqui

        if(obj.getExamesSoroLabs() != null){
            List<ExamesSoroLabDTO> examesSoroLabDTOs = obj.getExamesSoroLabs()
            .stream()
            .map(examesSoroLab -> new ExamesSoroLabDTO())
            .collect(Collectors.toList());
            this.soroLabDTOs = examesSoroLabDTOs;
        }

        if(obj.getExamesImagems() != null){
            List<ExamesImagemDTO> examesImagemDTOs = obj.getExamesImagems()
            .stream()
            .map(examesImg -> new ExamesImagemDTO())
            .collect(Collectors.toList());
            this.imagemDTOs = examesImagemDTOs;
        }

        if(obj.getExamesFisicos() != null){
            List<ExameFisicosDTO> examesDTO = obj.getExamesFisicos()
            .stream()
            .map(examesFisicos -> new ExameFisicosDTO(examesFisicos)) //
            .collect(Collectors.toList());
            this.exameFisicosDTOs = examesDTO;
        }

        if(obj.getTestesFarmacologicos() != null){
            List<TestesFarmacologicosDTO> testesFarmaDTO = obj.getTestesFarmacologicos()
            .stream()
            .map(testesFarma -> new TestesFarmacologicosDTO())
            .collect(Collectors.toList());
            this.testesDTO = testesFarmaDTO;
        }
       
    } 

    public Especialidade getTipoEspecialidade() {
        return especialidade;
    }

}
