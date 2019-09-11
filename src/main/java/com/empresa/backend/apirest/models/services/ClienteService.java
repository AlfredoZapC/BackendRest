package com.empresa.backend.apirest.models.services;

import java.util.List;

import com.empresa.backend.apirest.models.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findByid(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
