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

    private String examesCorretosTestesDTO;

    private String examesIncorretosTestesDTO;

    public TestesFarmacologicosDTO(TestesFarmacologicos obj) {
        this.idTestesDTO = obj.getIdTestes();
        this.examesCorretosTestesDTO = obj.getTesteCorreto();
        this.examesIncorretosTestesDTO = obj.getTestesIncorretos();
    }

}
