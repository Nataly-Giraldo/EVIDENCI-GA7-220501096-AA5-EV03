package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Registro;

public interface RegistroServices {
	public Optional<Registro>findById(Integer id);
	public List<Registro> findAll();
	public Registro save(Registro r);
	public void deleteById(int id);
}
