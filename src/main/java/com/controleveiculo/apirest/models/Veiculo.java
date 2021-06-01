package com.controleveiculo.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//import javax.validation.constraints.NotEmpty;

//import java.util.Date;
	
    
	@Entity
	@Table(name="TB_VEICULO")
	public class Veiculo implements Serializable {
		
		
		private static final long serialVersionUID = 1L;
		
		@Id
		private long id;
		
		
		private double preco;
		
				
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
}