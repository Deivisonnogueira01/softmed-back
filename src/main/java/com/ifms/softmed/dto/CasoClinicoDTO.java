package com.ifms.softmed.dto;

import java.util.List;
import java.util.UUID;

import com.ifms.softmed.domain.model.InformacoesCasoClinico;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CasoClinicoDTO {
    
    private UUID id;

    private Integer numero;


    private List<InformacoesCasoClinico> informacoes;
}
