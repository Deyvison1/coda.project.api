package com.coda.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coda.api.models.Contato;
import com.coda.api.services.ContatoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping({"/contato"})
public class ContatoController 
{
	@Autowired
	private ContatoService contatoService;

	// DELETAR
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id)
	{
		Contato contato = contatoService.getById(id);

		if(contato == null ) 
		{
			return ResponseEntity.notFound().build();
		}
		contatoService.delete(contato);

		return ResponseEntity.noContent().build();
	}


	// ADICIONAR NOVO CONTATO
	@PostMapping
	public ResponseEntity<Contato> salvar(@RequestBody Contato contato)
	{
		return ResponseEntity.ok(contatoService.save(contato));	
	}

	// LISTAR CONTATO PELO ID
	@GetMapping("/{id}")
	public ResponseEntity<Contato> getById(@PathVariable long id) 
	{
		Contato contato = contatoService.getById(id);

		if(contato == null) 
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(contato);
	}

	// LISTAR POR NOME COMPLETO OU TELEFONE
	@GetMapping("search/{search}")
	public ResponseEntity<List<Contato>> getByEmail(@PathVariable String search)
	{
		return ResponseEntity.ok(contatoService.getByNomeCompletoOrTelefone(search));
	}


	// LISTAR TODOS
	@GetMapping
	public ResponseEntity<List<Contato>> getAll()
	{
		return ResponseEntity.ok(contatoService.getAll());
	}


}
