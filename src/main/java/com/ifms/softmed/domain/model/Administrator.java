package com.ifms.softmed.domain.model;

import java.util.stream.Collectors;

import javax.persistence.Entity;

import com.ifms.softmed.domain.enums.Perfil;
import com.ifms.softmed.dto.AdministratorDTO;

@Entity
public class Administrator extends Pessoa {
    
    private static final long serialVersionUID = 1L;


    public Administrator(){
        super();
        addPerfil(Perfil.ADMIN);
    }


    public Administrator(Integer id, String email, String senha) {
        super(id, email, senha);
        addPerfil(Perfil.ADMIN);
    }

    public Administrator(AdministratorDTO obj){
         super();
         this.id = obj.getId();
         this.email = obj.getEmail();
         this.senha = obj.getSenha();
         this.perfils = obj.getPerfils().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
         this.dataCriacao = obj.getDataCriacao();
    }
     


}
