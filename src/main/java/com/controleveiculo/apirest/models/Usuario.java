package com.controleveiculo.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import java.util.Date;


	@Entity
	@Table(name="TB_USUARIO")
	public class Usuario implements Serializable {
	
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
	
		@NotEmpty
		private String nome;
	

		@Email 
		@Size(min=5, max= 30)
		private String email;
	
		@NotEmpty
		@CPF
		private String cpf;
	
	
		@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
		private Date dataNascimento;

		@NotEmpty
		private String marca;
		
		@NotEmpty
		private String modelo;
		
		@NotEmpty
		private String ano;

			
		public long getId() {
			return id;
	}

		public void setId(long id) {
			this.id = id;
	}

		public String getNome() {
			return nome;
	}

		public void setNome(String nome) {
			this.nome = nome;
	}

		public String getEmail() {
			return email;
	}

		public void setEmail(String email) {
			this.email = email;
	}

		public String getCpf() {
			return cpf;
	}

		public void setCpf(String cpf) {
			this.cpf = cpf;
	}

		public Date getDataNascimento() {
			return dataNascimento;
	}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
	}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

}