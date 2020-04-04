package com.petz.test.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.petz.test.form.PetForm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pet implements Serializable {
	
	private static final long serialVersionUID = -1330120291666923843L;
	
	public Pet(PetForm petForm) {
		this.name = petForm.getName();
		this.birthDate = petForm.getBirthDate();
		this.weight = petForm.getWeight();
		this.color = petForm.getColor();
		this.breed = petForm.getBreed();
		this.client = Client.builder().id(petForm.getClientId()).build();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "name cannot be empty")
	private String name;
	
	@NotBlank(message = "birthDate cannot be empty")
	private String birthDate;
	
	@NotNull(message = "weight cannot be null")
	private Long weight;
	
	@NotBlank(message = "color cannot be empty")
	private String color;
	
	@NotBlank(message = "breed cannot be empty")
	private String breed;
	
	@ManyToOne
	private Client client;
	
}
