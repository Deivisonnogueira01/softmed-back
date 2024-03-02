package com.ifms.softmed.dto;

import java.io.Serializable;

import com.ifms.softmed.domain.model.Alternativa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlternativaDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer perguntaDTOId;

    private String alternativa;

    public AlternativaDTO(Alternativa obj) {
        this.id = obj.getId();
        this.perguntaDTOId = obj.getPergunta().getId();
        this.alternativa = obj.getAlternativa();
    }

}
