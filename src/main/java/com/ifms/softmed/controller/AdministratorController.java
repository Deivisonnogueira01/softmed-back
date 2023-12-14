package com.ifms.softmed.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.dto.AdministratorDTO;
import com.ifms.softmed.services.AdministratorService;

@RestController
@RequestMapping(value = "/admin")
public class AdministratorController {

  @Autowired
  private AdministratorService serviceImpl;

  @GetMapping
  public ResponseEntity<List<AdministratorDTO>> findAll() {
    List<Administrator> list = serviceImpl.findAll();
    List<AdministratorDTO> listDTO = list.stream().map(obj -> new AdministratorDTO(obj)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }

  @PostMapping
  public ResponseEntity<Administrator> create(@Valid @RequestBody AdministratorDTO objDTO) {
    Administrator newObj = serviceImpl.create(objDTO);

    return ResponseEntity.ok(newObj);
  }

}
