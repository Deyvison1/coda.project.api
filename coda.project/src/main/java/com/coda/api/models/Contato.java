	package com.coda.api.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name =  "contatos")
public class Contato 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nomeCompleto", nullable = false)
	private String nomeCompleto;
	
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Email> emails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Telefone> telefones;
	
	public Contato()
	{
		this.enderecos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.telefones = new ArrayList<>();
	}
}
