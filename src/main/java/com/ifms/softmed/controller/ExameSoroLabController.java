package com.ifms.softmed.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.ExamesSoroLab;
import com.ifms.softmed.dto.ExamesSoroLabDTO;
import com.ifms.softmed.services.impl.ExameSoroLabImpl;

@RestController
@RequestMapping("/exames-soro")
public class ExameSoroLabController {
    

    @Autowired
    ExameSoroLabImpl service;

     @GetMapping
     public ResponseEntity <List<ExamesSoroLabDTO>> findAll(){
    
        List<ExamesSoroLab> list = service.findAll();
        List<ExamesSoroLabDTO> listDTO = list.stream()
        .map(obj -> new ExamesSoroLabDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);

     }
}
