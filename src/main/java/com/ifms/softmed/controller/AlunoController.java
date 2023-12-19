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

import com.ifms.softmed.domain.model.Aluno;
import com.ifms.softmed.dto.AlunoDTO;
import com.ifms.softmed.services.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService serviceImpl;

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> findAll() {
        List<Aluno> list = serviceImpl.findAll();
        List<AlunoDTO> listDTO = list.stream().map(obj -> new AlunoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<Aluno> create(@Valid @RequestBody AlunoDTO objDTO) {
        Aluno newObj = serviceImpl.create(objDTO);

        return ResponseEntity.ok(newObj);
    }

}
