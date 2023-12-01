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

import com.ifms.softmed.domain.model.ExamesImagem;
import com.ifms.softmed.dto.ExamesImagemDTO;
import com.ifms.softmed.services.impl.ExameImagemImpl;

@RestController
@RequestMapping("/exames-imagem")
public class ExameImagemController {

    @Autowired
    ExameImagemImpl service;

    @GetMapping
    public ResponseEntity<List<ExamesImagemDTO>> findAll() {

        List<ExamesImagem> list = service.findAll();
        List<ExamesImagemDTO> listDto = list.stream()
                .map(obj -> new ExamesImagemDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);

    }

    @PostMapping
    public ResponseEntity<List<ExamesImagem>> criarExamesImagem(@RequestBody List<ExamesImagemDTO> examesImagemDTOs,
            @RequestParam("idCasoClinico") Integer idCasoClinico) {
        List<ExamesImagem> examesCriados = service.create(examesImagemDTOs, idCasoClinico);
        return new ResponseEntity<>(examesCriados, HttpStatus.CREATED);
    }
}
