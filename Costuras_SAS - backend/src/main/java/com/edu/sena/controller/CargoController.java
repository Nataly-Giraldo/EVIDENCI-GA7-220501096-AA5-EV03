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

import com.edu.sena.models.entity.Cargo;
import com.edu.sena.models.service.CargoServices;

@RestController
@RequestMapping("/api/cargo")
public class CargoController {
	@Autowired
	CargoServices cargoServices;
	
	@GetMapping("/{id}")
	public Optional<Cargo> buscarPorId(@PathVariable int id) {
		
		return cargoServices.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Cargo> listarTodos(){
		
		return cargoServices.findAll();
	}
	
	@PostMapping
	public Cargo guardar(@RequestBody Cargo cr) {
		
		return cargoServices.save(cr);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		
		cargoServices.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Cargo actualizar(@RequestBody Cargo cr, @PathVariable int id) {
		
		Cargo cEnBD = cargoServices.findById(id).get();
		
		cEnBD.setNombre(cr.getNombre());
		
		
		return cargoServices.save(cEnBD);
	}
}
