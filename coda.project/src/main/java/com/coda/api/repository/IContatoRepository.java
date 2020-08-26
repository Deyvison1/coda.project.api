package com.coda.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coda.api.models.Contato;

@Repository
public interface IContatoRepository extends JpaRepository<Contato, Long> {

}
