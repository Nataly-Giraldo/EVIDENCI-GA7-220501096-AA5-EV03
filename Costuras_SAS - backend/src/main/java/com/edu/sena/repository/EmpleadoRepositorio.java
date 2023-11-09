package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{

}
