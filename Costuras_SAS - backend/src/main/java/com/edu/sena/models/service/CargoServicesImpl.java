package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Cargo;
import com.edu.sena.repository.CargoRepositorio;

@Service
public class CargoServicesImpl implements CargoServices{

	@Autowired
	CargoRepositorio cargoRepositorio;
	@Override
	public Optional<Cargo> findById(Integer id) {
		return cargoRepositorio.findById(id);
	}

	@Override
	public List<Cargo> findAll() {
		return cargoRepositorio.findAll();
	}

	@Override
	public Cargo save(Cargo cr) {
		return cargoRepositorio.save(cr);
	}

	@Override
	public void deleteById(int id) {
		cargoRepositorio.deleteById(id);
	}

}
