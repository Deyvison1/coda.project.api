package com.coda.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coda.api.models.Contato;
import com.coda.api.models.Endereco;
import com.coda.api.repository.IContatoRepository;
import com.coda.api.repository.IEnderecoRepository;

@Service
public class ContatoService 
{
	@Autowired
	private IContatoRepository contatoRepository;

	@Autowired
	private IEnderecoRepository enderecoRepository;
	// LISTAR TODOS
	public List<Contato> getAll()
	{
		return contatoRepository.findAll();
	}

	// LISTAR POR ID
	public Contato getById(Long id) 
	{
		return contatoRepository.findById(id).get();
	}

	// LISTAR POR NOME COMPLETO OU TELEFONE
	public List<Contato> getByNomeCompletoOrTelefone(String search){
		return contatoRepository.findByNomeCompletoContaining(search);
	}

	// SALVAR NO BANCO
	public Contato save(Contato contato) 
	{
		return contatoRepository.save(contato);
	}

	// DELETAR
	public void delete(Contato contato)
	{	
		contatoRepository.delete(contato);
	}

	
}
