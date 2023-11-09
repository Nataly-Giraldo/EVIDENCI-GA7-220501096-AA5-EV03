package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Medios_pagos;
import com.edu.sena.repository.Medios_pagosRepositorio;

@Service
public class Medios_pagosServicesImpl implements Medios_pagosServices{

	@Autowired
	Medios_pagosRepositorio medios_pagosRepositorio;
	
	@Override
	public Optional<Medios_pagos> findById(Integer id) {
	
		return medios_pagosRepositorio.findById(id);
	}

	@Override
	public List<Medios_pagos> findAll() {
		return medios_pagosRepositorio.findAll();
	}

	@Override
	public Medios_pagos save(Medios_pagos mp) {
		return medios_pagosRepositorio.save(mp);
	}

	@Override
	public void deleteById(int id) {
		medios_pagosRepositorio.deleteById(id);
	}
}