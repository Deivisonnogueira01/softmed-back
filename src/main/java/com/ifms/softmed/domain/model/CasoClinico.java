package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.enums.Patologia;
import com.ifms.softmed.dto.CasoClinicoDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "caso_clinico")
public class CasoClinico implements Serializable {

    private static final long serialVersionUID = 1L;

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

    protected String profissaoPaciente; //

    protected String religiaoPaciente; //

    protected String naturalPaciente; //

    protected String residentePaciente; //

    protected String historiaDoencaAtual;

    protected String queixaPrincipal;

    protected String interrogatorioDiversosAparelhos;

    protected String historiaPatologicaPregressa;

    protected String historiaFamiliar;

    protected String historiaPsicossocial;

    @Enumerated(EnumType.STRING)
    protected Especialidade especialidade;

    @Enumerated(EnumType.STRING)
    protected Patologia patologia;

    @OneToMany(mappedBy = "caso")
    private List<ExamesSoroLab> examesCorretosSoroLab;

    @OneToMany(mappedBy = "caso")
    private List<ExamesSoroLab> examesIncorretosSoroLab;

    @OneToMany(mappedBy =  "casoi")
    private List<ExamesImagem> examesCorretosImagem;

    @OneToMany(mappedBy = "casoi")
    private List<ExamesImagem> examesIncorretosImagem;

    @OneToMany(mappedBy = "casof")
    private List<ExamesFisicos> examesCorretosFisicos;

    @OneToMany(mappedBy = "casof")
    private List<ExamesFisicos> examesIncorretosFisicos;

    @OneToMany(mappedBy = "casot")
    private List<TestesFarmacologicos> examesCorretosTestes;

    @OneToMany(mappedBy = "casot")
    private List<TestesFarmacologicos> examesIncorretosTestes;

    public CasoClinico() {
    }

    public CasoClinico(Integer casoClinicoId, Integer numero, String nomePaciente, Integer idadePaciente,
            Double alturaPaciente, Double pesoPaciente, String sexoPaciente, String corPaciente,
            String profissaoPaciente, String religiaoPaciente, String naturalPaciente, String residentePaciente,
            String historiaDoencaAtual, String queixaPrincipal, String interrogatorioDiversosAparelhos,
            String historiaPatologicaPregressa, String historiaFamiliar, String historiaPsicossocial,
            Especialidade especialidade,
            Patologia patologia) {
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
        this.patologia = patologia;

    }

    public CasoClinico(CasoClinicoDTO obj) {
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

        // AQUI
     /*   if(obj.getExameFisicosDTOs() == null){
            List<ExamesFisicos> examesFisicosList = obj.getExameFisicosDTOs()
            .stream()
            .map(exFisicos -> new ExamesFisicos(exFisicos))
            .collect(Collectors.toList());
            this.examesFisicos = examesFisicosList;
        }*/
    }

    public Especialidade getTipoEspecialidade() {
        return especialidade;
    }

    public Patologia getPatologia() {
        return patologia;
    }

    public void setTipoEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public void setPatologia(Patologia patologia) {
        this.patologia = patologia;
    }

}
