package com.ifms.softmed.domain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ExamesImagem implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExameImagem;
  
    private String examesCorretos;

    private String examesIncorretos;

    @ManyToMany
    @JoinTable(name ="exame_image_caso",
    joinColumns = @JoinColumn(name = "exame_image_id"),
    inverseJoinColumns = @JoinColumn(name = "caso_cli_img_id"))
    private List<CasoClinicoModelo> casoClinicoEIMG = new ArrayList<>();

    public ExamesImagem(){
        
    }

    public ExamesImagem(Integer idExameImagem, String examesCorretos, String examesIncorretos) {
        this.idExameImagem = idExameImagem;
        this.examesCorretos = examesCorretos;
        this.examesIncorretos = examesIncorretos;
    }

    public Integer getIdExameImagem() {
        return idExameImagem;
    }

    public void setIdExameImagem(Integer idExameImagem) {
        this.idExameImagem = idExameImagem;
    }

    public String getExamesCorretos() {
        return examesCorretos;
    }

    public void setExamesCorretos(String examesCorretos) {
        this.examesCorretos = examesCorretos;
    }

    public String getExamesIncorretos() {
        return examesIncorretos;
    }

    public void setExamesIncorretos(String examesIncorretos) {
        this.examesIncorretos = examesIncorretos;
    }

    public List<CasoClinicoModelo> getCasoClinicoEIMG() {
        return casoClinicoEIMG;
    }

    public void setCasoClinicoEIMG(List<CasoClinicoModelo> casoClinicoEIMG) {
        this.casoClinicoEIMG = casoClinicoEIMG;
    }
 
    
   

 

    
}
