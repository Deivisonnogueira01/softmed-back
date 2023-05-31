package com.ifms.softmed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamesImagemDTO { 

    private Integer idExameImagemDTO;

    private String examesCorretosImgDTO;

    private String examesIncorretosImgDTO;

}
