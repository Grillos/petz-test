package com.petz.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petz.test.domain.Pet;


@Repository
public interface PetRepository extends JpaRepository<Pet, Long>  {

	Optional<Pet> findByName(String name);
	
	
}