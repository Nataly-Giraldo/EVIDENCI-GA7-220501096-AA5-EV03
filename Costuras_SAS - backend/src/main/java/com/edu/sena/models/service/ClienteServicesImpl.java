package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Clientes;
import com.edu.sena.repository.ClienteRepositorio;

@Service

public class ClienteServicesImpl implements ClientesServies {

	@Autowired
	ClienteRepositorio clienteRepositorio;
	
	@Override
	public Optional<Clientes> findById(Integer id) {
		return clienteRepositorio.findById(id);
	}

	@Override
	public List<Clientes> findAll() {
		return clienteRepositorio.findAll();
	}

	@Override
	public Clientes save(Clientes c) {
		return clienteRepositorio.save(c);
	}

	@Override
	public void deleteById(int id) {
		clienteRepositorio.deleteById(id);
	}
} 