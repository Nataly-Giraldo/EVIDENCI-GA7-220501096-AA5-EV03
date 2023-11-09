package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.models.service.EmpleadoServices;

@RestController
@RequestMapping("/api/empleado")

public class EmpleadoController {
	@Autowired
	EmpleadoServices empleadoServices;
	
	@GetMapping("/{id}")
	public Optional<Empleado> buscarPorId(@PathVariable int id) {
		
		return empleadoServices.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Empleado> listarTodos(){
		
		return empleadoServices.findAll();
	}
	
	@PostMapping
	public Empleado guardar(@RequestBody Empleado e) {
		
		return empleadoServices.save(e);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		
		empleadoServices.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Empleado actualizar(@RequestBody Empleado e, @PathVariable int id) {
		
		Empleado cEnBD = empleadoServices.findById(id).get();
		
		cEnBD.setNombre(e.getNombre());
		cEnBD.setCargo(e.getCargo());
		cEnBD.setUsuario(e.getUsuario());
		cEnBD.setIden(e.getIden());
		
		return empleadoServices.save(cEnBD);
	}
}