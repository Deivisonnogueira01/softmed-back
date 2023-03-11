package com.ifms.softmed.domain.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ifms.softmed.domain.enums.Siglas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InformacoesCasoClinico {
    

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

 private Siglas siglas;


 private String informacoes;

 @ManyToOne
 @JoinColumn(name = "caso_clinico_id")
 private CasoClinicoModelo casoClinicoModelo;
// private Boolean cliqueOpcao;



}
