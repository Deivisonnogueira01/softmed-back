package com.ifms.softmed.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.enums.Patologia;
import com.ifms.softmed.domain.model.CasoClinico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    private List<ExamesSoroLabDTO> examesSoroLab = new ArrayList<>();

    private List<ExamesImagemDTO> examesImagem = new ArrayList<>();

    private List<ExameFisicosDTO> examesFisicos = new ArrayList<>();

    private List<TestesFarmacologicosDTO> examesTestesFarma = new ArrayList<>();
    
    public CasoClinicoDTO(CasoClinico obj) {
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
        this.patologia = obj.getPatologia();

        if(obj.getExamesSoroLab() != null){
            List<ExamesSoroLabDTO> examesSoroLabsCorretosDTO = obj.getExamesSoroLab()
            .stream()
            .map(examesCorreLab -> new ExamesSoroLabDTO(examesCorreLab))
            .collect(Collectors.toList());
            this.examesSoroLab = examesSoroLabsCorretosDTO;
        }

        if(obj.getExamesImagem() != null){
            List<ExamesImagemDTO> examesCorretosDTO = obj.getExamesImagem()
            .stream()
            .map(examesCorretosObj -> new ExamesImagemDTO(examesCorretosObj))
            .collect(Collectors.toList());
            this.examesImagem = examesCorretosDTO;
        }

        if(obj.getExamesFisicos() != null){
            List<ExameFisicosDTO> examesCorretosDTO = obj.getExamesFisicos()
            .stream()
            .map(examesCorretosDTOObj -> new ExameFisicosDTO(examesCorretosDTOObj))
            .collect(Collectors.toList());
            this.examesFisicos = examesCorretosDTO;
        }

        if(obj.getExamesTesteFarma() != null){
            List<TestesFarmacologicosDTO> testesCorretosDTO = obj.getExamesTesteFarma()
            .stream()
            .map(examesCorretosTestesObj -> new TestesFarmacologicosDTO(examesCorretosTestesObj))
            .collect(Collectors.toList());
            this.examesTestesFarma = testesCorretosDTO;
        }

    }

    public Especialidade getTipoEspecialidade() {
        return especialidade;
    }

}
