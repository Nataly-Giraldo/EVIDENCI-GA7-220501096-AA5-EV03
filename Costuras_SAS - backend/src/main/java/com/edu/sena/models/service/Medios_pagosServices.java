package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Medios_pagos;

public interface Medios_pagosServices {
	public Optional<Medios_pagos>findById(Integer id);
	public List<Medios_pagos> findAll();
	public Medios_pagos save(Medios_pagos mp);
	public void deleteById(int id);
}