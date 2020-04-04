package com.petz.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.petz.test.domain.Pet;
import com.petz.test.dto.PetDto;
import com.petz.test.repository.PetRepository;

@Service
public class PetService {
	
	@Autowired
	private PetRepository petRepository;
	
	public Page<PetDto> findAll(Pageable pageable) {		
		Page<Pet> users = petRepository.findAll(pageable);
		return users.map(PetDto::new);
	}
	
	public PetDto findById(Long id) {
		return new PetDto(petRepository.getOne(id));
	}
	
	public PetDto create(Pet pet) {
		return new PetDto(petRepository.save(pet));
	}
	
	public void update(Long id, Pet pet) {
		petRepository.save(pet);
	}

}
