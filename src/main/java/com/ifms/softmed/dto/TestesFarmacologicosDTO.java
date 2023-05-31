package com.ifms.softmed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestesFarmacologicosDTO {
    
    private Integer idTestesDTO;

    private String examesCorretosTestesDTO;

    private String examesIncorretosTestesDTO;
  
}
