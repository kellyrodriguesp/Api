package com.controleveiculo.apirest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.controleveiculo.apirest.models.Veiculo;


@FeignClient(url = "https://parallelum.com.br/fipe/api/v1/carros/marcas", name= "fipe")
@Service
public interface VeiculoService {
	
	//https://parallelum.com.br/fipe/api/v1/carros/marcas/6/modelos/45/anos/1995-1

	
	
	@GetMapping(path = "/{id}/modelos/{id}/anos/{id}json")
	Veiculo getPreco(@PathVariable("preco") String preco);
	

}
