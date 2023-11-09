package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.Medios_pagos;

@Repository
public interface Medios_pagosRepositorio extends JpaRepository<Medios_pagos, Integer>{

}
