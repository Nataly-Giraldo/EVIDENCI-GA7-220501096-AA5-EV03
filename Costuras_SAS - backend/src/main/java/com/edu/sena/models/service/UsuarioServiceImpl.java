package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Usuario;
import com.edu.sena.repository.UsuarioRepositorio;

//Aqui se describe la funcionalidad de los metodos
@Service
public class UsuarioServiceImpl implements UsuarioServices{
	
	//esto es para inyectar la dependencia
	@Autowired

	UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario save(Usuario u) {		
		return usuarioRepositorio.save(u);
	}

	@Override
	public String login(String user, String ctr) {
		Usuario usuario = usuarioRepositorio.findByUsername(user);
		
		if(usuario == null) {
			return "Usuario no encontrado";
		}
		
		if(!usuario.getPassword().equals(ctr)) {
			return "Contraseña incorrecta";
		}
		
		return "Inicio de sesion exitoso";
	}

	@Override
	public Optional<Usuario> findById(int id) {
		return usuarioRepositorio.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepositorio.findAll();
	}

	@Override
	public void deleteById(int id) {		
		usuarioRepositorio.deleteById(id);
	}
}