package com.petz.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petz.test.domain.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

	Optional<Client> findByName(String name);
	
	
}