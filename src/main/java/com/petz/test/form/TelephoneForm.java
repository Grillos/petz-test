package com.petz.test.form;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.petz.test.enumaration.TelephoneType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TelephoneForm{
	
	@NotBlank(message = "number cannot be empty")
	private String number;
	
	@Enumerated(EnumType.STRING)
	private TelephoneType type;
	
}
