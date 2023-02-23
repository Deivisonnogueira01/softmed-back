package com.ifms.softmed.domain.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class HipoteseOpcoesModelo {
    
     @Id
     private UUID idHipoteseOpcoes;

     private String nome;

     private boolean hipoVerdadeiro;

     private String hipoExplicacao;
}
