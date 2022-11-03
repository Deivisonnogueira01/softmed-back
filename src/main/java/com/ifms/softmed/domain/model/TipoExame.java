package com.ifms.softmed.domain.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class TipoExame {
    

    private String sorologia;
    private String bioQuimico;
    private String imunologico;

}
