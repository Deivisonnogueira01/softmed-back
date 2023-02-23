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
public class TipoExame {

    @Id
    private UUID idTipoExame;
    
    private String sorologia;
    private String bioQuimico;
    private String imunologico;

}
