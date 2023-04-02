package com.ifms.softmed.domain.model;

import javax.persistence.Entity;

import com.ifms.softmed.domain.enums.Perfil;

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

     


}
