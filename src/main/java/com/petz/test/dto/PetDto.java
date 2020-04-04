package com.petz.test.dto;

import com.petz.test.domain.Pet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetDto {
	
	public PetDto() {}
	
	public PetDto(Pet pet) {
		this.id = pet.getId();
		this.name = pet.getName();
		this.birthDate = pet.getBirthDate();
		this.weight = pet.getWeight();
		this.color = pet.getColor();
		this.breed =pet.getBreed();
	}
	
    private Long id;
    
	private String name;
	
	private String birthDate;
	
	private Long weight;
	
	private String color;
	
	private String breed;
		
	
}
