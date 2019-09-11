package com.empresa.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.backend.apirest.models.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
