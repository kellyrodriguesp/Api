package com.controleveiculo.apirest.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.controleveiculo.apirest.models.Usuario;
import com.controleveiculo.apirest.repository.UsuarioRepository;



		
		@ResponseBody
		@RestController
		@RequestMapping(path = "/api")
		@CrossOrigin(origins = "*")
		//"API REST USUARIO"
		public class UsuarioController{
		
		@Autowired
		UsuarioRepository usuarioRepository;
			
			
		
		//"Retorna uma lista de Usuarios"
		@GetMapping(path = "/usuario/todos")
		public List<Usuario> listaUsuario(){
			return usuarioRepository.findAll();
		}
		
	
		//"Retorna um usuario único"
		@GetMapping(path = "/usuario/{id}")
		public Usuario listaUsuarioUnico(@PathVariable(value="id") long id){
			return usuarioRepository.findById(id);
		}
		
		//value = "Salva um usuario"
		@PostMapping(path = "/usuario/salvar", consumes = "application/json", produces = "application/json")
		@ResponseStatus(HttpStatus.CREATED)
		public Usuario salvarUsuario(@RequestBody Usuario usuario) {
			return usuarioRepository.save(usuario);
			
		}	
		
		//"Deleta um usuario"
		@DeleteMapping(path = "/usuario/delete/id")
		public void deletaUsuario(@RequestBody @Valid Usuario usuario) {
		usuarioRepository.delete(usuario);
		
		}
		
	
	
	



}