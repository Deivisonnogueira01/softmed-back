package com.ifms.softmed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.CasoClinicoModelo;
import com.ifms.softmed.services.impl.CasoClinicoServiceImpl;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

//@Api(tags = "SoftMed", description = "Ferramenta.")
@RestController
@RequestMapping("/casos-clinicos")
public class CasoClinicoController {

  // private final CasoClinicoService casoClinicoService;
  // private final JWTUtil jwtUtil;

  @Autowired
  private CasoClinicoServiceImpl service;

  @GetMapping(value = "/{id}")
  public ResponseEntity<CasoClinicoModelo> findById(@PathVariable Integer id) {
    CasoClinicoModelo obj = this.service.findbyId(id);
    return ResponseEntity.ok().body(obj);

  }
  /*
   * @ApiOperation(value = "Consulta de Casos Clinicos", notes =
   * "Recurso para consulta de Casos Clinicos", response = List.class)
   * 
   * @GetMapping(value = "/consultar")
   * public ResponseEntity<List<CasoClinicoModelo>>
   * consultarCasosClinicos(CasoClinicoModelo casos, HttpServletRequest request){
   * return ResponseEntity.ok(casoClinicoService.consultarComParametros(casos));
   * }
   */

}
