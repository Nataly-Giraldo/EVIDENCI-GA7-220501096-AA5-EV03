package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Usuario;
import com.edu.sena.models.service.UsuarioServices;

//se defin la rutas para la invocacion de los metodos
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	UsuarioServices usuarioServices;
	
	@PostMapping
	private Usuario guardar(@RequestBody Usuario u) { 
		
		return usuarioServices.save(u);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Usuario usuario){
		
		String mensaje = usuarioServices.login(usuario.getUsername(), usuario.getPassword());
		return ResponseEntity.ok(mensaje);
	}
	@GetMapping("/{id}")
	public Optional<Usuario> buscarPorId(@PathVariable int id) {
		
		return usuarioServices.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Usuario> listarTodos(){
		
		return usuarioServices.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		
		usuarioServices.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario u, @PathVariable int id) {
		
		Usuario uEnBD = usuarioServices.findById(id).get();
		
		uEnBD.setUsername(u.getUsername());
		uEnBD.setPassword(u.getPassword());
		
		return usuarioServices.save(uEnBD);		
	}
}