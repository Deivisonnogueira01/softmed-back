package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ifms.softmed.domain.enums.Perfil;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/* 
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_pessoa")
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     protected Integer id;

     @Column(unique = true)
     protected String email;

     protected String senha;
     
     @ElementCollection(fetch = FetchType.EAGER)
     @CollectionTable(name = "PERFIS")
     protected Set<Perfil> perfils = new HashSet<>();

     @JsonFormat(pattern = "dd/mm/yyyy")
     protected LocalDate dataCriacao = LocalDate.now();
     
}*/
