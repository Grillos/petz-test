package com.petz.test.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Client implements Serializable {
	
	private static final long serialVersionUID = -1330120291666923843L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "name cannot be empty")
	private String name;
	
	@OneToOne
	private Address address;
	
	@ManyToMany
	private List<Telephone> telephones;
	
	@ManyToMany
	private List<Document> documents;
	
}
