package com.ifms.softmed.domain.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ifms.softmed.domain.enums.Especialidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EspecialidadeMedica {
 
    @Id
    private UUID idEspecialidadeMedica;

    private Especialidade especialidade;
    
}
