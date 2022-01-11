package com.luke.pertshop.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
	private Integer id;
	private String nome;
	
	public Categoria() {
		//Construtor vazio
	}

	public Categoria(Integer id, String nome) {
		//Construtor com campos
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Inicio HashCode	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	//Fim HashCode

	//Inicio Get e Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//Fim Get e Set
	
}
