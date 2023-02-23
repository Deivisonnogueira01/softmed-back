package com.ifms.softmed.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.security.JWTUtil;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

//@Api(tags = "SoftMed", description = "Ferramenta.")
@RestController
public class CasoClinicoController {
    
      //  private final CasoClinicoService casoClinicoService;
     // private final JWTUtil jwtUtil;


   /*   @ApiOperation(value = "Consulta de Casos Clinicos", notes = "Recurso para consulta de Casos Clinicos", response = List.class)
     @GetMapping(value = "/consultar")
     public ResponseEntity<List<CasoClinicoModelo>> consultarCasosClinicos(CasoClinicoModelo casos, HttpServletRequest request){
        return ResponseEntity.ok(casoClinicoService.consultarComParametros(casos));
     }*/

}
