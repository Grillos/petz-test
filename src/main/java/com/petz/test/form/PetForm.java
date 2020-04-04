package com.petz.test.form;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetForm {
	
    private Long clientId;
    
	private String name;
	
	private String birthDate;
	
	private Long weight;
	
	private String color;
	
	private String breed;
		
	
}
