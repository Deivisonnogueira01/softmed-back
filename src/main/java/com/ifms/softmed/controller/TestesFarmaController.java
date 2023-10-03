package com.ifms.softmed.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.TestesFarmacologicos;
import com.ifms.softmed.dto.TestesFarmacologicosDTO;
import com.ifms.softmed.services.impl.TesteFarmaImpl;

@RestController
@RequestMapping("/teste-farma")
public class TestesFarmaController {
    

    @Autowired
    TesteFarmaImpl service;

     @GetMapping
      public ResponseEntity<List<TestesFarmacologicosDTO>> findAll(){

        List<TestesFarmacologicos> list = service.findAll();
        List<TestesFarmacologicosDTO> listDTO = list.stream()
        .map(obj -> new TestesFarmacologicosDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
        
      }
}
