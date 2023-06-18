package com.ifms.softmed.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.dto.ExamesImagemDTO;
import com.ifms.softmed.services.impl.ExameImagemImpl;

@RestController
@RequestMapping("/exames-imagem")
public class ExameImagemController {
    
    @Autowired
    ExameImagemImpl service;

    @GetMapping
    public ResponseEntity <List<ExamesImagemDTO>> findAll(){
        
        List<ExamesImagem> list = service.findAll();
        List<ExamesImagemDTO> listDto = list.stream()
        .map(obj -> new ExamesImagemDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);

    }
}
