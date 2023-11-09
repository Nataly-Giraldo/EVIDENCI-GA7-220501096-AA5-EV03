package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Registro;
import com.edu.sena.repository.RegistroRepositorio;

@Service
public class RegistroServicesImpl implements RegistroServices{
	@Autowired
	RegistroRepositorio registroRepositorio;

	@Override
	public Optional<Registro> findById(Integer id) {
		return registroRepositorio.findById(id);
	}

	@Override
	public List<Registro> findAll() {
		return registroRepositorio.findAll();
	}

	@Override
	public Registro save(Registro r) {
		return registroRepositorio.save(r);
	}

	@Override
	public void deleteById(int id) {
		registroRepositorio.deleteById(id);		
	}
}