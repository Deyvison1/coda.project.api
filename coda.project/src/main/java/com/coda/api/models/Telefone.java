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
public class Telefone 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "uf", nullable = false)
	private EnumUF uf;
	
	@Column(name = "numero", unique = true)
	private String numero;
	
	@Column(name = "preferencial")
	private boolean preferencial = false;
}
