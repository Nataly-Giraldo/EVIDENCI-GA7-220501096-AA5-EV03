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
import com.edu.sena.models.entity.Registro;
import com.edu.sena.models.service.RegistroServices;

@RestController
@RequestMapping("/api/registro")
public class RegistroController {
	@Autowired
	RegistroServices registroServices;
	
	@GetMapping("/{id}")
	public Optional<Registro> buscarPorId(@PathVariable int id) {
		
		return registroServices.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Registro> listarTodos(){
		
		return registroServices.findAll();
	}
	
	@PostMapping
	public Registro guardar(@RequestBody Registro r) {
		
		return registroServices.save(r);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		
		registroServices.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Registro actualizar(@RequestBody Registro r, @PathVariable int id) {
		
		Registro rEnBD = registroServices.findById(id).get();
		
		rEnBD.setSolicitud(r.getSolicitud());
		rEnBD.setClientes(r.getClientes());
		rEnBD.setEmpleado(r.getEmpleado());
		rEnBD.setMedios_pagos(r.getMedios_pagos());
		
		return registroServices.save(rEnBD);
	}
}