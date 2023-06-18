package com.ifms.softmed.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.dto.CasoClinicoDTO;

@Service
public interface CasoClinicoService {

    List<CasoClinico> findAll();

    CasoClinico findbyId(Integer id);

    List<CasoClinico> findByEspecialidade(Especialidade especialidade);

    CasoClinico create(CasoClinicoDTO casoClinicoDTO);
}
