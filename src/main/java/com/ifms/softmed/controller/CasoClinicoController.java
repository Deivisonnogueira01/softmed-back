package com.ifms.softmed.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.CasoClinico;
import com.ifms.softmed.dto.CasoClinicoDTO;
import com.ifms.softmed.services.impl.CasoClinicoServiceImpl;

@RestController
@RequestMapping(value ="/casos-clinicos")
public class CasoClinicoController {

  @Autowired
  private CasoClinicoServiceImpl service;

  @GetMapping(value = "/{id}")
  public ResponseEntity<CasoClinicoDTO> findById(@PathVariable Integer id) {
    CasoClinico obj = service.findbyId(id);
    return ResponseEntity.ok().body(new CasoClinicoDTO(obj));

  }

  @GetMapping
  public ResponseEntity<List<CasoClinicoDTO>> findAll(){
    List<CasoClinico> list = service.findAll();
    List<CasoClinicoDTO> listDTO = list.stream()
    .map(obj -> new CasoClinicoDTO(obj)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }


  @GetMapping("/espec/{especialidade}")
  public List<CasoClinico> getFindByEspecialidade(@PathVariable Especialidade especialidade){
     return service.findByEspecialidade(especialidade);
  }

 // @PreAuthorize("hasAnyRole('ADMIN')")
  @PostMapping
  public ResponseEntity<CasoClinicoDTO> create(@Valid @RequestBody CasoClinicoDTO objDTO){
     CasoClinico newObj = service.create(objDTO);
     URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getCasoClinicoId()).toUri();
     return ResponseEntity.created(uri).build();
  }

  

}
