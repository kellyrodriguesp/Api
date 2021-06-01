package com.controleveiculo.apirest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.controleveiculo.apirest.models.Veiculo;
//import com.controleveiculo.apirest.models.Veiculo;
import com.controleveiculo.apirest.service.VeiculoService;


@RestController
@RequestMapping(path = "https://deividfortuna.github.io/fipe/carros")
//"API REST VEICULO"
public class VeiculoController {
	
	@Autowired
	VeiculoService veiculoService;
	
	@GetMapping({"/{id}/modelos/{id}/anos/{id}json"})
    public ResponseEntity<Veiculo> getMarca(@RequestBody String preco) {
		Veiculo veiculo = veiculoService.getPreco(preco);
        return veiculo != null ? ResponseEntity.ok().body(veiculo) : ResponseEntity.notFound().build(); 
    }
}