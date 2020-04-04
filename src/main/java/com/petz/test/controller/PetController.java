package com.petz.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.petz.test.domain.Pet;
import com.petz.test.dto.PetDto;
import com.petz.test.form.PetForm;
import com.petz.test.service.PetService;
import com.sun.istack.NotNull;

@RestController
@RequestMapping(value = "/v1/pets")
public class PetController {

	@Autowired
	private PetService petService;
	 
    @GetMapping
    public Page<PetDto> findAll(@PageableDefault(sort = "id", direction = Direction.DESC, page = 0, size = 10) Pageable pageable) {
    	return petService.findAll(pageable);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<PetDto> findById(@PathVariable @NotNull Long id) {
    	PetDto petDto = petService.findById(id);
    	return (petDto != null) ? new ResponseEntity<>(petDto, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping
    public ResponseEntity<PetDto> create(@RequestBody @Valid PetForm pet, UriComponentsBuilder uri) {
    	PetDto petDto = petService.create(new Pet(pet));
    	
    	return ResponseEntity.created(
    			uri.path("/users/{id}").buildAndExpand(petDto.getId()).toUri()).body(petDto);
    }
    
    @PutMapping("/{id}")
    public void send(@PathVariable Long id, @RequestBody @Valid Pet pet) {
    	petService.update(id, pet);
    }
    
}
