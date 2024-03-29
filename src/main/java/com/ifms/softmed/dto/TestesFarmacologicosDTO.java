package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.model.TestesFarmacologicos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestesFarmacologicosDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idTestesDTO;

    private String testesFarmaDTOCorreto;

    private String testesFarmaDTOIncorreto;

    private Integer casoClinicoId;


    public TestesFarmacologicosDTO(TestesFarmacologicos obj) {
        this.idTestesDTO = obj.getIdTestes();
        this.testesFarmaDTOCorreto = obj.getTesteFarmaCorreto();
        this.testesFarmaDTOIncorreto = obj.getTestesFarmaIncorreto();
        this.casoClinicoId = obj.getCasot().getCasoClinicoId();
    }

}
