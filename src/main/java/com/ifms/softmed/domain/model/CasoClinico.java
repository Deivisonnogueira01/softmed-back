package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

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
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "caso_clinico")
public class CasoClinico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer casoClinicoId;

    private Integer numero;

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

    private String historiaDoencaAtual;

    private String queixaPrincipal;

    private String interrogatorioDiversosAparelhos;

    private String historiaPatologicaPregressa;

    private String historiaFamiliar;

    private String historiaPsicossocial;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Enumerated(EnumType.STRING)
    private Patologia patologia;

    @OneToMany(mappedBy = "caso")
    private List<ExamesSoroLab> examesSoroLab;

    @OneToMany(mappedBy =  "casoi")
    private List<ExamesImagem> examesImagem;

    @OneToMany(mappedBy = "casof")
    private List<ExamesFisicos> examesFisicos;

    @OneToMany(mappedBy = "casot")
    private List<TestesFarmacologicos> examesTesteFarma;
  
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
 
      if(obj.getExamesFisicos() != null){
            List<ExamesFisicos> examesFisicosList = obj.getExamesFisicos()
            .stream()
            .map(exFisicos -> new ExamesFisicos(exFisicos))
            .collect(Collectors.toList());
            this.examesFisicos = examesFisicosList;
        }

         if(obj.getExamesImagem() != null){
            List<ExamesImagem> exImagemList = obj.getExamesImagem()
            .stream()
            .map(exObj -> new ExamesImagem(exObj))
            .collect(Collectors.toList());
            this.examesImagem = exImagemList;
        }

         if(obj.getExamesSoroLab() != null){
            List<ExamesSoroLab> examesCorretosList = obj.getExamesSoroLab()
            .stream()
            .map(soroLabObj -> new ExamesSoroLab(soroLabObj))
            .collect(Collectors.toList());
            this.examesSoroLab = examesCorretosList;
        }

         if(obj.getExamesTestesFarma() != null){
            List<TestesFarmacologicos> testeCorretoList = obj.getExamesTestesFarma()
            .stream()
            .map(testeCorretoObj -> new TestesFarmacologicos(testeCorretoObj))
            .collect(Collectors.toList());
            this.examesTesteFarma = testeCorretoList;
        }
        
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
