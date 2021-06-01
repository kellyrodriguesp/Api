package com.controleveiculo.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controleveiculo.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	Usuario findById(long id);
}
