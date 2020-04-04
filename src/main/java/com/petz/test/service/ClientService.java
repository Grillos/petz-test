package com.petz.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.petz.test.domain.Client;
import com.petz.test.dto.ClientDto;
import com.petz.test.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository userRepository;
	
	public Page<ClientDto> findAll(Pageable pageable) {		
		Page<Client> users = userRepository.findAll(pageable);
		return users.map(ClientDto::new);
	}
	
	public ClientDto findById(Long id) {
		return new ClientDto(userRepository.getOne(id));
	}
	
	public ClientDto create(Client user) {
		return new ClientDto(userRepository.save(user));
	}
	
	public void update(Long id, Client user) {
		userRepository.save(user);
	}

}
