package com.ifms.softmed.domain.model;

import java.util.stream.Collectors;

import javax.persistence.Entity;

import com.ifms.softmed.domain.enums.Perfil;
import com.ifms.softmed.dto.AlunoDTO;

@Entity
public class Aluno extends Pessoa {
    
    private static final long serialVersionUID = 1L;


    public Aluno() {
        super();
        addPerfil(Perfil.ALUNO);
    }

    public Aluno(Integer id, String email, String senha) {
        super(id,email,senha);
        addPerfil(Perfil.ALUNO);

    }
    
    public Aluno(AlunoDTO obj){
         super();
         this.id = obj.getId();
         this.email = obj.getEmail();
         this.senha = obj.getSenha();
         this.perfils = obj.getPerfils().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
         this.dataCriacao = obj.getDataCriacao();
    }



}
