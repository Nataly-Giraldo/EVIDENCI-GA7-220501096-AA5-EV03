package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.repository.EmpleadoRepositorio;

@Service

public class EmpleadoServicesImpl implements EmpleadoServices {

	@Autowired
	EmpleadoRepositorio empleadoRepositorio;
//cada vez que se cree una entidad toca borrar y volver a poner los metodos con la entidad correcta.
	
	@Override
	public Optional<Empleado> findById(int id) {
		return empleadoRepositorio.findById(id);
	}

	@Override
	public List<Empleado> findAll() {
		return empleadoRepositorio.findAll();
	}

	@Override
	public Empleado save(Empleado e) {
		return empleadoRepositorio.save(e);
	}

	@Override
	public void deleteById(int id) {
		empleadoRepositorio.deleteById(id);
	}
} 