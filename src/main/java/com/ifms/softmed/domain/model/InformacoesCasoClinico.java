package com.ifms.softmed.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/* 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class InformacoesCasoClinico {
    

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

 private String informacoes;

 @ManyToOne
 @JoinColumn(name = "caso_clinico_id")
 private CasoClinicoModelo casoClinicoModelo;
// private Boolean cliqueOpcao;



}
*/