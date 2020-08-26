package com.coda.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coda.api.models.Contato;
import com.coda.api.services.ContatoService;

@RestController
@RequestMapping({"/contato"})
public class ContatoController {

	@Autowired
	private ContatoService contatoService;
	
	@PostMapping
	public ResponseEntity<Contato> Salvar(@RequestBody Contato contato)
	{
		return ResponseEntity.ok(contatoService.Salvar(contato));
	}
	@GetMapping
	public ResponseEntity<List<Contato>> GetAll()
	{
		return ResponseEntity.ok(contatoService.GetAll());
	}
	
}
