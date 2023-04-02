package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

@Entity
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     protected Integer id;

     @Column(unique = true)
     protected String email;

     protected String senha;
     
     @ElementCollection(fetch = FetchType.EAGER)
     @CollectionTable(name = "PERFIS")
     protected Set<Integer> perfils = new HashSet<>();

     @JsonFormat(pattern = "dd/mm/yyyy")
     protected LocalDate dataCriacao = LocalDate.now();

    public Pessoa(Integer id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;  
        addPerfil(Perfil.ADMIN);  
    }

    public Pessoa() {
        super();
        addPerfil(Perfil.ADMIN);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Perfil> getPerfis() {
		return perfils.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}

    public void addPerfil(Perfil perfil){
            this.perfils.add(perfil.getCodigo());
    }


    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
     
       

}
