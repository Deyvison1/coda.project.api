package com.coda.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coda.api.models.Contato;
import com.coda.api.repository.IContatoRepository;

@Service
public class ContatoService 
{
	@Autowired
	private IContatoRepository contatoRepository;

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

	// LISTAR POR EMAIL
	public Contato getByEmailsEmail(String email)
	{
		return contatoRepository.findByEmailsEmail(email);
	}

	// LISTAR POR TELEFONE
	public Contato getByTelefoneNumero(int numero)
	{
		return contatoRepository.findByTelefonesNumero(numero);
	}

	// LISTAR POR NOME
	public List<Contato> getByNome(String nome)
	{
		return contatoRepository.findByNomeCompleto(nome);
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

	// ATUALIZAR
	public Contato update(Contato contato) throws Exception
	{
		Contato contatoUpdate = contatoRepository.getOne(contato.getId());
		contatoUpdate = contato;
		save(contatoUpdate);
		return contatoUpdate;
	}
}
