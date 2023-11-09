package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.Clientes;

@Repository
public interface ClienteRepositorio extends JpaRepository<Clientes, Integer>{
}