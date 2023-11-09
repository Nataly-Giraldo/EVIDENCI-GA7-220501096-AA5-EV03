package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;
import com.edu.sena.models.entity.Clientes;

public interface ClientesServies {
	public Optional<Clientes>findById(Integer id);
	public List<Clientes> findAll();
	public Clientes save(Clientes c);
	public void deleteById(int id);
}