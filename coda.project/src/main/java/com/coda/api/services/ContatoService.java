package com.coda.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coda.api.models.Contato;
import com.coda.api.repository.IContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private IContatoRepository contatoRepository;
	
	public List<Contato> GetAll(){
		return contatoRepository.findAll();
	}
	
	public Contato Salvar(Contato contato) {
		return contatoRepository.save(contato);
	}
}
