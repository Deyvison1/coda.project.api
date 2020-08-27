package com.coda.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coda.api.models.Endereco;

@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {

}
