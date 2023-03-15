package com.ifms.softmed.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ExameEspecifico {
    
    @Id
    private String idExameEspecifico;

    private String glicose;
}
