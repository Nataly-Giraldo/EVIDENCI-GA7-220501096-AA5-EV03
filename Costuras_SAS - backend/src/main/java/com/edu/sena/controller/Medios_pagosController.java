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

import com.edu.sena.models.entity.Medios_pagos;
import com.edu.sena.models.service.Medios_pagosServices;

@RestController
@RequestMapping("/api/medios_pagos")
public class Medios_pagosController {

		@Autowired
		Medios_pagosServices medios_pagosService;
		
		@GetMapping("/{id}")
		public Optional<Medios_pagos> buscarPorId(@PathVariable int id) {
			
			return medios_pagosService.findById(id);		
		}
		
		@GetMapping("/listar")
		public List<Medios_pagos> listarTodos(){
			
			return medios_pagosService.findAll();
		}
		
		@PostMapping
		public Medios_pagos guardar(@RequestBody Medios_pagos mp) {
			
			return medios_pagosService.save(mp);
		}
		
		@DeleteMapping("/{id}")
		public void eliminar(@PathVariable int id) {
			
			medios_pagosService.deleteById(id);
		}
		
		@PutMapping("/actualizar/{id}")
		public Medios_pagos actualizar(@RequestBody Medios_pagos mp, @PathVariable int id) {
			
			Medios_pagos mpEnBD = medios_pagosService.findById(id).get();
			
			mpEnBD.setCodigo(mp.getCodigo());
			mpEnBD.setEfectivo(mp.getEfectivo());
			mpEnBD.setNombre(mp.getNombre());
			
			
			return medios_pagosService.save(mpEnBD);
		}
}