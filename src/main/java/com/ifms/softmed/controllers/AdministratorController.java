package com.ifms.softmed.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.dto.AdministratorDTO;
import com.ifms.softmed.services.impl.AdministratorServiceImpl;

@RestController
@RequestMapping(value = "/admin")
public class AdministratorController {

  @Autowired
  private AdministratorServiceImpl serviceImpl;

  @GetMapping
  public ResponseEntity<List<AdministratorDTO>> findAll() {
    List<Administrator> list = serviceImpl.findAll();
    List<AdministratorDTO> listDTO = list.stream().map(obj -> new AdministratorDTO(obj)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }

  @PreAuthorize("hasAnyRole('ADMIN')")
  @PostMapping
  public ResponseEntity<AdministratorDTO> create(@Valid @RequestBody AdministratorDTO objDTO) {
    Administrator newObj = serviceImpl.create(objDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
    return ResponseEntity.created(uri).build();
  }

}
