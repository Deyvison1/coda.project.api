package com.coda.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coda.api.models.Contato;

@Repository
public interface IContatoRepository extends JpaRepository<Contato, Long> 
{
	// LISTAR PELO NOME COMPLETO
	List<Contato> findByNomeCompleto(String nomeCompleto);
	
	// LISTAR PELO NUMERO DE TELEFONE
	Contato findByTelefonesNumero(int telefone);
	
	// LISTAR PELO ENDERECO DE EMAIL
	Contato findByEmailsEmail(String email);	
}
