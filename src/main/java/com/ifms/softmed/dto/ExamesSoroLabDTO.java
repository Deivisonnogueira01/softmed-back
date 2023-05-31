package com.ifms.softmed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamesSoroLabDTO {
    
    private Integer idExameSoroLabDTO;

    private String examesCorretosSoroLabDTO;

    private String examesIncorretosSoroLabDTO;
    
}
