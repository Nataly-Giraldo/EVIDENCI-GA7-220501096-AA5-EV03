package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Empleado;

public interface EmpleadoServices {

	Optional<Empleado> findById(int id);
	List<Empleado> findAll();
	Empleado save(Empleado e);
	void deleteById(int id);
}