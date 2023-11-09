package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Usuario;

//Aqui se definen los metodos a usar
public interface UsuarioServices {
	public Usuario save(Usuario u);
	public String login(String user, String ctr);
	public Optional<Usuario>findById(int id);
	public List<Usuario> findAll();
	public void deleteById(int id);
}