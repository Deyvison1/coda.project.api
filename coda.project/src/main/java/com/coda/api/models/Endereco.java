package com.coda.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "uf", nullable = false)
	private EnumUF uf;
	
	@Column(name = "municipio")
	private String municipio;
	
	@Column(name = "cep", length = 7, nullable = false, unique = true)
	private int cep;
	// TRUE => PREFERENCIAL,  FALSE => NÃO PREFERENCIAL
	@Column(name = "preferencial")
	private boolean preferencial = false;
}
