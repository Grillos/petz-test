package com.petz.test.dto;

import java.util.List;

import com.petz.test.domain.Address;
import com.petz.test.domain.Client;
import com.petz.test.domain.Document;
import com.petz.test.domain.Telephone;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDto {
	
	public ClientDto() {}
	
	public ClientDto(Client client) {
		this.id = client.getId();
		this.telephones = client.getTelephones();
		this.documents = client.getDocuments();
		this.address = client.getAddress();
	}
	
    private Long id;
	
    private List<Telephone> telephones;
	
	private List<Document> documents;
	
	private Address address;
	
}
