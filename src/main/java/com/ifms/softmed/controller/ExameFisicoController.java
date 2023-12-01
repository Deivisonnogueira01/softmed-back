package com.ifms.softmed.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.ExamesFisicos;
import com.ifms.softmed.dto.ExameFisicosDTO;
import com.ifms.softmed.services.impl.ExameFisicoImpl;

@RestController
@RequestMapping(value = "/exames-fisicos")
public class ExameFisicoController {
    
 @Autowired
 ExameFisicoImpl service;

 @GetMapping
 public ResponseEntity<List<ExameFisicosDTO>> findAll(){
     List<ExamesFisicos> list = service.findAll();
     List<ExameFisicosDTO> listDto = list.stream()
     .map(obj -> new ExameFisicosDTO(obj)).collect(Collectors.toList());
     return ResponseEntity.ok().body(listDto);
 }

  
    @PostMapping
    public ResponseEntity<List<ExamesFisicos>> criarExamesFisicos(@RequestBody List<ExameFisicosDTO> examesFisicosDTO,
            @RequestParam("idCasoClinico") Integer idCasoClinico) {
        List<ExamesFisicos> examesCriados = service.create(examesFisicosDTO, idCasoClinico);
        return new ResponseEntity<>(examesCriados, HttpStatus.CREATED);
    }

 
}
